package com.project.Reservation.dto;

public class Passenger {
    int id;
    String passenger_name;
    int age;
    String passenger_sex;
    double fare;
    String seat_no;

    public Passenger() {
    }

    public Passenger(int id, String passenger_name, int age, String passenger_sex, double fare, String seat_no) {
        this.id = id;
        this.passenger_name = passenger_name;
        this.age = age;
        this.passenger_sex = passenger_sex;
        this.fare = fare;
        this.seat_no = seat_no;
    }

    public String getPassenger_name() {
        return passenger_name;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassenger_sex() {
        return passenger_sex;
    }

    public void setPassenger_sex(String passenger_sex) {
        this.passenger_sex = passenger_sex;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getSeat_no() {
        return seat_no;
    }

    public void setSeat_no(String seat_no) {
        this.seat_no = seat_no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passenger_name='" + passenger_name + '\'' +
                ", age=" + age +
                ", passenger_sex='" + passenger_sex + '\'' +
                ", fare=" + fare +
                ", seat_no='" + seat_no + '\'' +
                '}';
    }
}
