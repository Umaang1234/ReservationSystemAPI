package com.project.Reservation.service;

import com.project.Reservation.dto.BookingDetails;

import java.util.List;

public interface BookingService {
    void saveBooking(BookingDetails bookingDetails);
    BookingDetails getBookingByPnr(Long pnr);
    void deleteBookingByPnr(Long pnr);
}
