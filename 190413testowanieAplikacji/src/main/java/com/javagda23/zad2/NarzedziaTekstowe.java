package com.javagda23.zad2;

public class NarzedziaTekstowe {
    public static String zamienNaDuzeZnaki(String tekst) {
        return tekst.toUpperCase();
    }

    public static String odwrocString(String tekst) {

        String odwroconyTekst = "";

        String[] s = tekst.split("");

        for (int i = 0; i < tekst.length(); i++) {
            odwroconyTekst += s[tekst.length() - 1 - i];
        }

        return odwroconyTekst;
    }

    public static String zwielokrotnijString(String str, int i){
        String nowyTekst = "";
        for (int j = 0; j < i; j++) {
            nowyTekst += str + " ";
        }
        return nowyTekst.trim();
    }

    public static String usunWielkieLitery (String str){

        return str.replaceAll("[A-Z]", "").trim();
    }

    public static String usunMaleLitery (String str){
        return str.replaceAll("[\\s,a-z]", "").trim();
    }

    public static String usunZnakiAlfaNumeryczne (String str){
        return str.replaceAll("[0-9]", "").trim();
    }

}
