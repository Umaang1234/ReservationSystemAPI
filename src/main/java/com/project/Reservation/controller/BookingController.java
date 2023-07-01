package com.project.Reservation.controller;

import com.project.Reservation.dto.BookingDetails;
import com.project.Reservation.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @PostMapping("/book")
    void bookTicket (@RequestBody BookingDetails bookingDetails){
      bookingService.saveBooking(bookingDetails);
    }
}
