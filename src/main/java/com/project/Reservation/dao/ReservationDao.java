package com.project.Reservation.dao;

import com.project.Reservation.dto.Passenger;

import java.util.List;

public interface ReservationDao {
    void addPassenger(Passenger passenger);
    List<Passenger> getPassenger();

}
