package com.lukmie.zad2_homeworkNBP;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Operations {

    public static LocalDateTime checkDate(LocalDateTime localDateTime) {

        if (localDateTime.getDayOfWeek() == DayOfWeek.SATURDAY){
            localDateTime = localDateTime.minusDays(1);
            System.out.println("Sobota, pobrano dane z piątku.");
        } else if (localDateTime.getDayOfWeek() == DayOfWeek.SUNDAY){
            localDateTime = localDateTime.minusDays(2);
            System.out.println("Niedziela, pobrano dane z piątku.");
        }

        return localDateTime;
    }

    public static double roundValue(double value, int places) {

        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);

        return bd.doubleValue();
    }
}
