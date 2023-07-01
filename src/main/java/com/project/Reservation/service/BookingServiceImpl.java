package com.project.Reservation.service;

import com.project.Reservation.dao.BookingDao;
import com.project.Reservation.dto.BookingDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingDao bookingDao;
    @Override
    public void saveBooking(BookingDetails bookingDetails) {
        bookingDao.saveBooking(bookingDetails);
    }
}
