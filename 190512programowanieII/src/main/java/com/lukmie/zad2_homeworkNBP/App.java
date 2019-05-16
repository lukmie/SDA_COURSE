package com.lukmie.zad2_homeworkNBP;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Calculations calculations = new Calculations();

        calculations.printActualMidRates();
        calculations.printActualAskRates();
        calculations.printAskRatesFrom30DaysAgo();
        calculations.hundredPlnInForeignCurrenciesTodayMIDRate();
        calculations.hundredPlnInForeignCurrenciesTodayASKRate();
        calculations.hundredPlnInForeignCurrencies30DaysAgoASKRate();
        System.out.println(calculations.balance());

    }
}
