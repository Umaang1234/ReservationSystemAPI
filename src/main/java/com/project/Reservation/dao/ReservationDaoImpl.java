package com.project.Reservation.dao;


import com.project.Reservation.dto.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public class ReservationDaoImpl implements ReservationDao {
    private static final Logger log = Logger.getLogger(ReservationDaoImpl.class.getName());
    @Autowired
    private JdbcTemplate jdbc;
    @Override
    public void addPassenger(Passenger passenger) {
        int update = this.jdbc.update(Queries.INSERT_PASSENGER, new Object[]{passenger.getPassenger_name(),passenger.getAge(),passenger.getPassenger_sex(),passenger.getFare(),passenger.getSeat_no()});
        log.info("The rows affected " + update);
    }
}
