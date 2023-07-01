package com.project.Reservation.dao;

import com.project.Reservation.dto.BookingDetails;

public interface BookingDao{
    void saveBooking(BookingDetails bookingDetails);
}
