package com.project.Reservation.controller;

import com.project.Reservation.dto.BookingDetails;
import com.project.Reservation.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class BookingController {
    private static final Logger log = Logger.getLogger(BookingController.class.getName());
    @Autowired
    private BookingService bookingService;
    @PostMapping("/book")
    void bookTicket (@RequestBody BookingDetails bookingDetails){
      bookingService.saveBooking(bookingDetails);
    }
    @GetMapping("/book/{pnr}")
    BookingDetails getBookingByPnr(@PathVariable("pnr") Long pnr){
      BookingDetails bookingDetails = bookingService.getBookingByPnr(pnr);
      return bookingDetails;
    }

    @DeleteMapping("/book/{pnr}")
    void deleteBookingByPnr(@PathVariable("pnr") Long pnr){
        bookingService.deleteBookingByPnr(pnr);
        log.info("Deleted Successfully");
    }

}
