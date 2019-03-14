package com.javagda23.zad10_function;

import com.javagda23.zad1_zad2.Czlowiek;
import com.javagda23.zad9_predicate.Urlop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //1
        Function<String, String> toSamo = wartosc -> wartosc;
        System.out.println(toSamo.apply("cos tam cos tam"));
        Function<String, String> toSamo2 = Function.identity(); //to samo co powyzej tylko zapisane inaczej
        System.out.println("tez cos tam");

        //2
        Function<String, Integer> dlugoscCiagu = ciagZnakow -> ciagZnakow.length();
        Function<String, Integer> dlugoscCiagu2 = String::length;
        System.out.println(dlugoscCiagu.apply("to jest test"));

        //3
        Function<Integer, Integer> mnozenie = liczba -> liczba < 0 ? liczba*-liczba : liczba*liczba;
//        {
//            liczba < 0 ? liczba*liczba :liczba*-liczba;
//            if (liczba < 0){
//                return liczba * -liczba;
//            } else{
//                return liczba * liczba;
//            }
//        };
        System.out.println(mnozenie.apply(-3));

        //4
        Function<String, Integer> stringIntegerFunction = dlugoscCiagu.andThen(mnozenie);
        System.out.println(stringIntegerFunction.apply("sssss"));

        //5
        Function<String, Czlowiek> tworzenieCzlowieka = imie -> new Czlowiek(imie);
        Function<String, Czlowiek> tworzenieCzlowieka2 = Czlowiek::new;
        System.out.println(tworzenieCzlowieka.apply("Spejson"));

        //6
        Pracownik pracownik = new Pracownik("Adrain", "Ada");
        pracownik.setUrlop(new Urlop(LocalDate.of(2018, Month.MARCH,1), LocalDate.of(2018,Month.APRIL,21)));

        Function<Pracownik, String> tworzenie1 = pracownik1 ->
                (pracownik1.getImie().charAt(0) + " " + pracownik1.getNazwisko().charAt(0));
        System.out.println(tworzenie1.apply(pracownik));

        Function<Pracownik, String> dlugoscUrlopu = pracownik1 ->{
            final Period period = Period.between(
                    pracownik1.getUrlop().getDate1(),
                    pracownik1.getUrlop().getDate2());
            return period.getMonths() + " miesiac " + period.getDays() + " dni";

        };
        System.out.println(dlugoscUrlopu.apply(pracownik));



//        Period period = Period.between(pracownik.getUrlop().getDate1(), pracownik.getUrlop().getDate2());
//        System.out.println(period);



    }
}
