package com.project.Reservation.service;

import com.project.Reservation.dao.ReservationDao;
import com.project.Reservation.dto.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements  ReservationService {
    @Autowired
    private ReservationDao reservationDao;

    @Override
    public void addPassenger(Passenger pasDetails) {
        this.reservationDao.addPassenger(pasDetails);
    }
    public List<Passenger> getPassenger() {
       List<Passenger> list= this.reservationDao.getPassenger();
       return list;
    }
}
