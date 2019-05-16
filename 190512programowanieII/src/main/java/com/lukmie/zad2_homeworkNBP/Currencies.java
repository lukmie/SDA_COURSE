package com.lukmie.zad2_homeworkNBP;

public enum Currencies {
    USD("usd"),
    EUR("eur"),
    GBP("gbp"),
    CHF("chf");

    private String code;

    Currencies(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
