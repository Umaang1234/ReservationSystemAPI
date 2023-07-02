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

    public static final String UPDATE_PNR_PAXINFO = "UPDATE `trainreservationsystem`.`pax_info` SET `PNR` = ? WHERE (`Passenger_id` = ?)";

    public static final String SELECT_LAST_PASSENGER = "SELECT last_insert_id()";

    public static final String SELECT_BOOKING_DETAILS_WITH_PAXINFO = "SELECT `ticket_reservation`.`to_date`,`ticket_reservation`.`from_date`,"+
        "`ticket_reservation`.`to_km`, `ticket_reservation`.`from_km`,`ticket_reservation`.`to_station`,"+
            "`ticket_reservation`.`from_station`,`ticket_reservation`.`Train_code`,`ticket_reservation`.`PNR_no`,`pax_info`.`Passenger_id`,`pax_info`.`PAX_name`,"+
            "`pax_info`.`PAX_age`,`pax_info`.`PAX_sex`,`pax_info`.`Seat_No`,`pax_info`.`fare` FROM `trainreservationsystem`.`ticket_reservation` INNER JOIN `trainreservationsystem`.`pax_info` ON `ticket_reservation`.`PNR_no` = `pax_info`.`PNR`"+
            "WHERE `ticket_reservation`.`PNR_no` = ?";
}
