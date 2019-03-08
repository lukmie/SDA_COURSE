package com.javagda23.zad14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s1 = "ale m qr a";
        zawieraDuplikaty(s1);

        String s2 = "ale m qr";
        zawieraDuplikaty(s2);
    }

    public static boolean zawieraDuplikaty(String tekst){
        String[] s = tekst.replaceAll("[.]", "").replaceAll(" ", "").trim().split("");

        List<String> list = new ArrayList<String>(Arrays.asList(s));
        Set<String> set = new HashSet<>(list);
        if (list.size() == set.size()) {
            System.out.println("Nie ma duplikatow");
            return true;
        } else {
            System.out.println("Są ");
            return false;
        }

    }
}
