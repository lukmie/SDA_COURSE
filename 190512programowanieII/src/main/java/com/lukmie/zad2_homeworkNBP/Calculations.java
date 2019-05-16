package com.lukmie.zad2_homeworkNBP;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Calculations {

    private static final long DAYSAGO_0 = 0;
    private static final long DAYSAGO_30 = 30;

    private String code;

    private Connection connection = new Connection();

    private Map<String, Double> currencyMap = new HashMap<>();


    public Map<String, Double> midExchangeRates(){
        Double mid;
        for (int i = 0; i < Currencies.values().length; i++) {
            code = Currencies.values()[i].getCode();
            mid = connection.getJsonFromURL(Table.A, code, DAYSAGO_0).getMidValue();
            currencyMap.put(code, mid);
        }

        return currencyMap;
    }

    public Map<String, Double> askExchangeRates(long daysAgo){
        Double ask;
        for (int i = 0; i < Currencies.values().length; i++) {
            code = Currencies.values()[i].getCode();
            ask = connection.getJsonFromURL(Table.C, code, daysAgo).getAskValue();
            currencyMap.put(code, ask);
        }

        return currencyMap;
    }

    public void printActualMidRates(){
        System.out.println("Aktualne kursy srednie(MID) walut obcych podane w PLN:");
        midExchangeRates().entrySet().forEach(System.out::println);
    }

    public void printActualAskRates(){
        System.out.println("Aktualne kursy sprzedazy(ASK) walut obcych podane w PLN:");
        askExchangeRates(DAYSAGO_0).entrySet().forEach(System.out::println);
    }

    public void printAskRatesFrom30DaysAgo(){
        System.out.println("Kursy sprzedazy(ASK) walut obcych podane w PLN sprzed 30 dni:");
        askExchangeRates(DAYSAGO_30).entrySet().forEach(System.out::println);
    }

    public void hundredPlnInForeignCurrenciesTodayMIDRate(){
        System.out.println("Wartosc 100 PLN w poszczegolnych walutach po aktualnym kursie srednim:");
        midExchangeRates().entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> Operations.roundValue(100/e.getValue(), 4)))
                .forEach((code, value) -> System.out.println(code + "=" + value));
    }

    public void hundredPlnInForeignCurrenciesTodayASKRate(){
        System.out.println("Wartosc 100 PLN w poszczegolnych walutach po aktualnym kursie sprzedazy(ASK):");
        askExchangeRates(DAYSAGO_0).entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> Operations.roundValue(100/e.getValue(), 4)))
                .forEach((code, value) -> System.out.println(code + "=" + value));
    }

    public void hundredPlnInForeignCurrencies30DaysAgoASKRate(){
        System.out.println("Wartosc 100 PLN w poszczegolnych walutach sprzed 30 dni po kursie sprzedazy(ASK):");
        askExchangeRates(DAYSAGO_30).entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> Operations.roundValue(100/e.getValue(), 4)))
                .forEach((code, value) -> System.out.println(code + "=" + value));
    }

    public Map<Currencies, Double> balance(){
        Map<Currencies, Double> resultMap = new HashMap<>();
        double value;
        Double result;
        for (int i = 0; i < Currencies.values().length; i++) {
            value = 100/askExchangeRates(DAYSAGO_30).get(Currencies.values()[i].getCode()) - 100/askExchangeRates(DAYSAGO_0).get(Currencies.values()[i].getCode());
            result = Operations.roundValue(value, 4);
            resultMap.put(Currencies.values()[i], result* connection.getJsonFromURL(Table.C, code, DAYSAGO_0).getAskValue());
        }
        System.out.println("Kupując waluty za 100 PLN 30 dni wczesniej " +
                "mozna bylo zarobic(warosci z +)/stracic(wartosci z -) w PLN:");
        return resultMap;
    }


}
