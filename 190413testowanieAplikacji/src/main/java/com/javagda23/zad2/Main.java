package com.javagda23.zad2;

public class Main {
    public static void main(String[] args) {
//        System.out.println(NarzedziaTekstowe.odwrocString("abs"));
//        System.out.println(NarzedziaTekstowe.zwielokrotnijString("test", 3));
//        System.out.println(NarzedziaTekstowe.usunWielkieLitery("Jan Kowalski"));
//        System.out.println(NarzedziaTekstowe.usunMaleLitery("Jan Kowalski"));
//        System.out.println(NarzedziaTekstowe.usunZnakiAlfaNumeryczne("123Tekst"));
        System.out.println(frontBack("assd"));
    }

    public static String frontBack(String str){
        return str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
    }
}
