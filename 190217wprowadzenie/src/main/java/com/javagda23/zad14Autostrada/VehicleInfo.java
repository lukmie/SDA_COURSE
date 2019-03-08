package com.javagda23.zad14Autostrada;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VehicleInfo {
    private String rejestracja;
    private CarType carType;
    private LocalDateTime dataWjazdu;

    public VehicleInfo(String rejestracja, CarType carType) {
        this.rejestracja = rejestracja;
        this.carType = carType;
        this.dataWjazdu = LocalDateTime.now().minusHours(2);
    }

    public String getRejestracja() {
        return rejestracja;
    }

    public void setRejestracja(String rejestracja) {
        this.rejestracja = rejestracja;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public LocalDateTime getDataWjazdu() {
        return dataWjazdu;
    }

    public void setDataWjazdu(LocalDateTime dataWjazdu) {
        this.dataWjazdu = dataWjazdu;
    }

    @Override
    public String toString() {
        return "VehicleInfo{" +
                "rejestracja='" + rejestracja + '\'' +
                ", carType=" + carType +
                ", dataWjazdu=" + dataWjazdu +
                '}';
    }
}
