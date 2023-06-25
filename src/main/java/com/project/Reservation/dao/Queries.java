package com.project.Reservation.dao;

public final class Queries {
    public static final String INSERT_PASSENGER = "INSERT INTO `trainreservationsystem`.`pax_info` " +
                                                  "(`PAX_name`, `PAX_age`, `PAX_sex`, `fare`, `Seat_No`)" +
                                                  " VALUES (?, ?, ?, ?, ?)";
    public static final String SELECT_PASSENGER = "SELECT `PAX_name`, `PAX_age`, `PAX_sex`, `fare`, `Seat_No` " +
                                                  "FROM`trainreservationsystem`.`pax_info` ";
}
