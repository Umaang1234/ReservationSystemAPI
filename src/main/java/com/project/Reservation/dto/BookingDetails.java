package com.project.Reservation.dto;


public class BookingDetails {
    Long pnr;
    String to_date;
    String from_date;
    double to_km;
    double from_km;
    String to_station;
    String from_station;

    String train_code;

    Passenger passenger;

    public BookingDetails() {
    }

    public BookingDetails(String to_date , String from_date , double to_km, double from_km, String to_station, String from_station, String train_code, Passenger passenger) {
        this.to_date = to_date;
        this.from_date =  from_date;
        this.to_km = to_km;
        this.from_km= from_km;
        this.to_station = to_station;
        this.from_station = from_station;
        this.train_code =train_code;
        this.passenger = passenger;
    }

    public Long getPnr() {
        return pnr;
    }

    public void setPnr(Long pnr) {
        this.pnr = pnr;
    }

    public String getTo_date() {
        return to_date;
    }

    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public double getTo_km() {
        return to_km;
    }

    public void setTo_km(double to_km) {
        this.to_km = to_km;
    }

    public double getFrom_km() {
        return from_km;
    }

    public void setFrom_km(double from_km) {
        this.from_km = from_km;
    }

    public String getTo_station() {
        return to_station;
    }

    public void setTo_station(String to_station) {
        this.to_station = to_station;
    }

    public String getFrom_station() {
        return from_station;
    }

    public void setFrom_station(String from_station) {
        this.from_station = from_station;
    }

    public String getTrain_code() {
        return train_code;
    }

    public void setTrain_code(String train_code) {
        this.train_code = train_code;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "BookinDetails{" +
                "to_date='" + to_date + '\'' +
                ", from_date='" + from_date + '\'' +
                ", to_km=" + to_km +
                ", from_km=" + from_km +
                ", to_station=" + to_station +
                ", from_station=" + from_station +
                ", train_code='" + train_code + '\'' +
                '}';
    }
}
