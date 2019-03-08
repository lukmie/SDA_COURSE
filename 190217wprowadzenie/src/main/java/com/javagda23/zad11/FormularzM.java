package com.javagda23.zad11;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class FormularzM extends Formularz {
    private String zarost;

    public FormularzM() {
        super();
    }

    @Override
    public String toString() {
        return  "zarost=" + zarost + "\n" +
                "##############################";
    }
}
