package com.project.Reservation.dao;

import com.project.Reservation.dto.BookingDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public class BookingDaoImpl implements BookingDao{
    private static final Logger log = Logger.getLogger(BookingDaoImpl.class.getName());
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void saveBooking(BookingDetails bookingDetails) {
        int update = jdbcTemplate.update(Queries.INSERT_BOOKINGDETAILS , new Object[]{
                bookingDetails.getTo_date(),bookingDetails.getFrom_date(),
                bookingDetails.getTo_km(),bookingDetails.getFrom_km(),
                bookingDetails.getTo_station(),bookingDetails.getFrom_station(),
                bookingDetails.getTrain_code()
        });
        log.info("The rows affected "+update);
    }
}
