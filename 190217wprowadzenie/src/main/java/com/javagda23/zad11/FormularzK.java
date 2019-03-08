package com.javagda23.zad11;

import lombok.Data;

@Data
public class FormularzK extends Formularz {
    private String rodzajWlosow;
    @Override
    public String toString() {
        return  "rodzajWlosow=" + rodzajWlosow + "\n" +
                "##############################";
    }
}
