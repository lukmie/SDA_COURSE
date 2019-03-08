package com.javagda23.zad14Autostrada;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        VehicleInfo vehicleInfo = new VehicleInfo("123", CarType.CAR);
        Highway highway = new Highway();
        highway.vehicleEntry("123", CarType.CAR);
        System.out.println(highway.searchVehicle("123"));
        highway.vehicleLeave("123");


    }
}
