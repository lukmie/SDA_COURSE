package com.javagda23.zad14Autostrada;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Highway {
    private List<VehicleInfo> list = new ArrayList<>();
    private LocalDateTime dataWyjazdu;

    public void vehicleEntry(String rejestracja, CarType carType){
        list.add(new VehicleInfo(rejestracja, carType));
        System.out.println("Dodano pojazd o numerze rejestracyjnym: " + rejestracja);
    }

    public VehicleInfo searchVehicle(String rejestracja){
        for (VehicleInfo vehicleInfo : list) {
            if(vehicleInfo.getRejestracja().equals(rejestracja)){
                return  vehicleInfo;
            }
        }
        return null;
    }

    public void vehicleLeave(String rejestracja){
        Iterator<VehicleInfo> iterator = list.iterator();
        while(iterator.hasNext()){
            VehicleInfo vehicleInfo = iterator.next();
            if(vehicleInfo.getRejestracja().equals(rejestracja)){
                iterator.remove();
                System.out.println("Usunięto pojazd o numerze rejestracyjnym: " + rejestracja);
                dataWyjazdu = LocalDateTime.now();
            }
            long duration = Duration.between(vehicleInfo.getDataWjazdu(), dataWyjazdu).toNanos();
            System.out.println("Czas pobytu na autostradzie wyniósł: " + duration);
        }

    }
}
