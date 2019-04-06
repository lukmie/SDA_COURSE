package com.javagda23.structural.facade;

import java.util.Random;

public class AvailabilityService {

    public boolean isAvailable(int id){
        return new Random().nextBoolean();
    }

}
