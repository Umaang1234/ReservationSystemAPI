package com.project.Reservation.controller;

import com.project.Reservation.dto.Passenger;
import com.project.Reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class ReservationController {
    private static final Logger log = Logger.getLogger(ReservationController.class.getName());
    @Autowired
    private ReservationService reservationService;
    @PostMapping("/addPassenger")
    void addPassenger(@RequestBody Passenger psgdetails){
        reservationService.addPassenger(psgdetails);
        log.info("Passenger Data is added successfully");
    }

    @GetMapping("/getPassenger")
    public List<Passenger> findAllPassenger() {
        List<Passenger> list = reservationService.getPassenger();
        return list;
    }

}
