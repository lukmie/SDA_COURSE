package com.javagda23.zad9_predicate;

import java.time.LocalDate;
import java.util.function.Predicate;

public class TestUrlopu implements Predicate<Urlop> {
    private LocalDate localDate;

    public TestUrlopu(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public boolean test(Urlop urlop) {
        return localDate != null && !localDate.isBefore(urlop.getDate1()) && !localDate.isAfter(urlop.getDate2());
    }
}
