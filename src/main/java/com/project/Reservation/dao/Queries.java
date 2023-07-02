package com.project.Reservation.dao;

public final class Queries {
    public static final String INSERT_PASSENGER = "INSERT INTO `trainreservationsystem`.`pax_info` " +
                                                  "(`PAX_name`, `PAX_age`, `PAX_sex`, `fare`, `Seat_No`)" +
                                                  " VALUES (?, ?, ?, ?, ?)";
    public static final String SELECT_PASSENGER = "SELECT `PAX_name`, `PAX_age`, `PAX_sex`, `fare`, `Seat_No` " +
                                                  "FROM`trainreservationsystem`.`pax_info` ";
    public static final String INSERT_BOOKINGDETAILS = "INSERT INTO `trainreservationsystem`.`ticket_reservation` " +
            "(`to_date`, `from_date`, `to_km`, `from_km`, `to_station` , `from_station` , `Train_code`)" +
            " VALUES (?, ?, ?, ?, ?, ?, ?)";

    public static final String SELECT_BOOKING_BY_PNR = "SELECT * FROM trainreservationsystem.ticket_reservation where PNR_no=?";

    public static final String DELETE_BOOKING_BY_PNR = "DELETE FROM trainreservationsystem.ticket_reservation where PNR_no=?";

}
