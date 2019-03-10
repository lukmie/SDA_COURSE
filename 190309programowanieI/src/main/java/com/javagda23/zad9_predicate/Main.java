package com.javagda23.zad9_predicate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //1
        Predicate<String> testNull = n -> n != null;
//        Predicate<String> testNull = Objects::nonNull;

        //2
        System.out.println(testNull.test(null));
        System.out.println(testNull.test(""));
        System.out.println(testNull.test("dsf"));

        //3
        System.out.println("################");
        Predicate<String> testEmptyString = n -> n.isEmpty();
        System.out.println(testEmptyString.test(""));

        //5
        System.out.println("################");
        System.out.println(testEmptyString.and(testNull).test("asd"));
        System.out.println(testEmptyString.or(testNull).test("asd"));
        System.out.println(testEmptyString.negate().test(""));
        System.out.println(testNull.negate().test(null));

        //6
        System.out.println("$$$$$$$$$$$$$$$$$$");
        LocalDate ld1 = LocalDate.of(2017,7, 13);
        LocalDate ld2 = LocalDate.of(2017,8, 1);

        LocalDate localDate1 = LocalDate.of(2019,3, 9);
        LocalDate localDate2 = LocalDate.of(2019,3, 17);


        Urlop urlop1 = new Urlop(ld1, ld2);
        Urlop urlop2 = new Urlop(localDate1, localDate2);

        Predicate<Urlop> czyAktu = urlop -> {
            LocalDate dzis = LocalDate.now();
            return !dzis.isBefore(urlop.getDate1()) && !dzis.isAfter(urlop.getDate2());
        };
        System.out.println(czyAktu.test(urlop1));
        System.out.println(czyAktu.test(urlop2));

        //7
//        Predicate<TestUrlopu> testUrlopu = urloptest -> urloptest.
        TestUrlopu testUrlopu = new TestUrlopu(LocalDate.of(2017,7,20));
        testUrlopu.setLocalDate(LocalDate.of(2017,7,22));
        System.out.println(testUrlopu.test(urlop1));


    }
}
