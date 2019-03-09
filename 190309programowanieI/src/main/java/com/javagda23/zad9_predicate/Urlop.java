package com.javagda23.zad9_predicate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Urlop {
    private LocalDate date1;
    private  LocalDate date2;

    public Urlop(LocalDate date1, LocalDate date2) {
        this.date1 = date1;
        this.date2 = date2;
    }

    public LocalDate getDate1() {
        return date1;
    }

    public void setDate1(LocalDate date1) {
        this.date1 = date1;
    }

    public LocalDate getDate2() {
        return date2;
    }

    public void setDate2(LocalDate date2) {
        this.date2 = date2;
    }
}
