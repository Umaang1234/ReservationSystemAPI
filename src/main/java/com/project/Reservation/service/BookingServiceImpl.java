package com.project.Reservation.service;

import com.project.Reservation.dao.BookingDao;
import com.project.Reservation.dto.BookingDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingDao bookingDao;
    @Override
    public void saveBooking(BookingDetails bookingDetails) {
        bookingDao.saveBooking(bookingDetails);
    }

    @Override
    public BookingDetails getBookingByPnr(Long pnr) {
        return bookingDao.getBookingByPnr(pnr);
    }

    @Override
    public void deleteBookingByPnr(Long pnr) {
        bookingDao.deleteBookingByPnr(pnr);
    }



}
