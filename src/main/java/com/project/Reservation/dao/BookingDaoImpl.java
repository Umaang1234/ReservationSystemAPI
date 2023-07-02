package com.project.Reservation.dao;

import com.project.Reservation.dto.BookingDetails;
import com.project.Reservation.dto.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.logging.Logger;

@Repository
public class BookingDaoImpl implements BookingDao{
    private static final Logger log = Logger.getLogger(BookingDaoImpl.class.getName());
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void saveBooking(BookingDetails bookingDetails) {
        int updatePNR = this.jdbcTemplate.update(Queries.INSERT_BOOKINGDETAILS , new Object[]{
                bookingDetails.getTo_date(),bookingDetails.getFrom_date(),
                bookingDetails.getTo_km(),bookingDetails.getFrom_km(),
                bookingDetails.getTo_station(),bookingDetails.getFrom_station(),
                bookingDetails.getTrain_code()
        });
        Map<String,Object>  map = this.jdbcTemplate.queryForMap(Queries.SELECT_LAST_PASSENGER);
        if(updatePNR !=0){
            int updatePassengerPNR  = this.jdbcTemplate.update(Queries.UPDATE_PNR_PAXINFO,map.get("last_insert_id()"),bookingDetails.getPassenger().getId());
            log.info("The rows affected "+updatePassengerPNR);
        }

    }

    @Override
    public BookingDetails getBookingByPnr(Long pnr) {
        Map<String,Object> map =this.jdbcTemplate.queryForMap(Queries.SELECT_BOOKING_DETAILS_WITH_PAXINFO,pnr);
        Passenger passenger = new Passenger((Integer) map.get("Passenger_id"), (String) map.get("PAX_name"), (Integer) map.get("PAX_age"), (String) map.get("PAX_sex"), (Double) map.get("fare"), (String) map.get("Seat_No"));
        BookingDetails bookingDetails =new BookingDetails();
        bookingDetails.setPnr((Long) map.get("PNR_no"));
        bookingDetails.setTo_date((String) map.get("to_date"));
        bookingDetails.setFrom_date((String) map.get("from_date"));
        bookingDetails.setTo_km((Double) map.get("to_km"));
        bookingDetails.setFrom_km((Double) map.get("from_km"));
        bookingDetails.setTo_station((String) map.get("to_station"));
        bookingDetails.setFrom_station((String) map.get("from_station"));
        bookingDetails.setTrain_code((String) map.get("train_code"));
        bookingDetails.setPassenger(passenger);
        return bookingDetails;
    }

    @Override
    public void deleteBookingByPnr(Long Pnr) {
       int update = this.jdbcTemplate.update(Queries.DELETE_BOOKING_BY_PNR,Pnr);
       log.info("Rows affected"+ update);
    }
}
