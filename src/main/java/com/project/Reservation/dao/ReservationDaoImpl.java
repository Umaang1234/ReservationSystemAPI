package com.project.Reservation.dao;


import com.project.Reservation.dto.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
    public List<Passenger> getPassenger() {
        List<Map<String,Object>> list= this.jdbc.queryForList(Queries.SELECT_PASSENGER);
        List<Passenger> plist = new ArrayList<>();
        list.forEach(m -> {
            Passenger p = new Passenger();
            p.setPassenger_name((String) m.get("PAX_name"));
            p.setAge((int) m.get("PAX_age"));
            p.setPassenger_sex((String) m.get("PAX_sex"));
            p.setFare((Double) m.get("fare"));
            p.setSeat_no((String) m.get("seat_no"));
            plist.add(p);
        });
        return plist;
    }
}
