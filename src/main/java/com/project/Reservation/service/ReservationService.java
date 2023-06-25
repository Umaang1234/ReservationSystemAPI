package com.project.Reservation.service;

import com.project.Reservation.dto.Passenger;

import java.util.List;

public interface ReservationService {
     void addPassenger(Passenger pasDetails);
     List<Passenger> getPassenger();
}
