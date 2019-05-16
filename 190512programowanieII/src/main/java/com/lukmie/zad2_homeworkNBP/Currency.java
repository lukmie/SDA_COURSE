package com.lukmie.zad2_homeworkNBP;

import java.util.List;

public class Currency {
    private String table;
    private String currency;
    private String code;
    private List<Rate> rates;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public Double getMidValue(){
        return rates.get(0).getMid();
    }

    public Double getAskValue(){
        return rates.get(0).getAsk();
    }
}
