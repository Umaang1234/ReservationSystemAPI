package com.project.Reservation.dao;

import com.project.Reservation.dto.BookingDetails;

import java.util.List;

public interface BookingDao{
    void saveBooking(BookingDetails bookingDetails);

    BookingDetails getBookingByPnr(Long pnr);

    void deleteBookingByPnr(Long Pnr);
}
