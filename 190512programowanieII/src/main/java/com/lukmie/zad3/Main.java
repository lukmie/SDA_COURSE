package com.lukmie.zad3;

import com.google.gson.Gson;


import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //enum waluty, tabele, tablica

//        for (int i = 0; i < Currencies.values().length; i++) {
////            String code = Currencies.values()[i].getCode();
////            LocalDateTime now = LocalDateTime.now();
////            System.out.println(
////                            "Waluta: " + createURL(Table.A, code, now).getCurrency() + "\n" +
////                            "Kurs sredni: " + createURL(Table.A, code, now).getMidValue() + "\n" +
////                            "Kurs sprzedazy: " + createURL(Table.C, code, now).getAskValue());
////        }
////
////        Double value = 100.0;
////        Double midValue;
////
////
////
////        LocalDateTime localDateTime = LocalDateTime.now();
////        if (localDateTime.getDayOfWeek() == DayOfWeek.TUESDAY) {
////            System.out.println(localDateTime.getDayOfWeek());
////        }
////        System.out.println("Dane z dziś: " +hundredPlnInForeignCurrenciesToday());
////        System.out.println("Dane sprzed 30 dni:" + hundredPlnInForeignCurrenciesMonthAgo());
////        System.out.println(balance());
////
////    }
////
////    private static Map<Currencies, Double> balance() throws IOException {
////
////        Map<Currencies, Double> resultMap = new HashMap<>();
////        double value;
////        double result;
////        for (int i = 0; i < Currencies.values().length; i++) {
////            String code = Currencies.values()[i].getCode();
////            LocalDateTime now = LocalDateTime.now();
////            value = hundredPlnInForeignCurrenciesToday().get(Currencies.values()[i]) - hundredPlnInForeignCurrenciesMonthAgo().get(Currencies.values()[i]);
////            result = roundValue(value, 4);
////            resultMap.put(Currencies.values()[i],result*createURL(Table.C, code, now).getAskValue());
////        }
////        return resultMap;
////    }
////
////    private static Map<Currencies, Double> hundredPlnInForeignCurrenciesToday() throws IOException {
////        Map<Currencies, Double> price = new HashMap<>();
////        double midValue;
////        double result = 0.0;
////        for (int i = 0; i < Currencies.values().length; i++) {
////            String code = Currencies.values()[i].getCode();
////            midValue = createURL(Table.C, code, checkDate(LocalDateTime.now())).getAskValue();
////            double value = 100/midValue;
////            result = roundValue(value, 4);
////            price.put(Currencies.values()[i], result);
//////            System.out.println(result);
////        }
////        return price;
////    }
////
////    private static Map<Currencies, Double> hundredPlnInForeignCurrenciesMonthAgo() throws IOException {
////        Map<Currencies, Double> price = new HashMap<>();
////        double midValue;
////        double result = 0.0;
////        for (int i = 0; i < Currencies.values().length; i++) {
////            String code = Currencies.values()[i].getCode();
////            midValue = createURL(Table.C, code, checkDate(LocalDateTime.now().minusDays(30))).getAskValue();
////            double value = 100/midValue;
////            result = roundValue(value, 4);
////            price.put(Currencies.values()[i], result);
//////            System.out.println(result);
////        }
////        return price;
////    }
////
////    private static LocalDateTime checkDate(LocalDateTime localDateTime) {
//////        localDateTime = LocalDateTime.now();
////        if (localDateTime.getDayOfWeek() == DayOfWeek.SATURDAY){
////            localDateTime = localDateTime.minusDays(1);
////            System.out.println("Sobota, pobrano dane z piątku.");
////        } else if (localDateTime.getDayOfWeek() == DayOfWeek.SUNDAY){
////            localDateTime = localDateTime.minusDays(2);
////            System.out.println("Niedziela, pobrano dane z piątku.");
////        }
////        return localDateTime;
////    }
////
////    public static double roundValue(double value, int places) {
////        if (places < 0) throw new IllegalArgumentException();
////
////        BigDecimal bd = new BigDecimal(value);
////        bd = bd.setScale(places, RoundingMode.HALF_UP);
////        return bd.doubleValue();
////    }
////
//////    private static Currency createURL(Table table, String nationality, LocalDateTime localDateTime) throws IOException {
//////        StringBuilder sb = new StringBuilder("http://api.nbp.pl/api/exchangerates/rates/");
//////        sb.append(table + "/" + nationality);
//////        sb.append("/" + LocalDateTime.now().minusDays(0).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "/?format=json").toString();
//////        System.out.println(sb.toString());
//////        return getJsonFromURL(sb.toString());
//////    }
////
////    private static Currency createURL(Table table, String nationality, LocalDateTime from) throws IOException {
////        StringBuilder sb = new StringBuilder("http://api.nbp.pl/api/exchangerates/rates/");
////        sb.append(table + "/" + nationality + "/");
////        if (table.getTableName().equalsIgnoreCase("c")) {
////            sb.append(from.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
////        }
////        sb.append("/" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "/?format=json").toString();
////        System.out.println(sb.toString());
////        return getJsonFromURL(sb.toString());
////    }
////
////    private static Currency getJsonFromURL(String link2) throws IOException {
////        URL url = new URL(link2);
////
////        Scanner scanner = new Scanner(url.openConnection().getInputStream());
////
////        String line = scanner.nextLine();
////
////        Gson gson = new Gson();
////        return gson.fromJson(line, Currency.class);
////    }
    }
}
