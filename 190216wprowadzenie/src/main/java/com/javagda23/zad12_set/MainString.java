package com.javagda23.zad12_set;

import java.util.*;

public class MainString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst:");
        String linia = scanner.nextLine();

        // czy mamy powtarzające się słowa?
        String[] strings = linia.split(" ");
        List<String> slowa = new ArrayList<>(Arrays.asList(strings));
        Set<String> bezDuplikatow = new HashSet<>(slowa);

        if (slowa.size() == bezDuplikatow.size()) {
            System.out.println("Nie ma duplikatow");
        } else {
            System.out.println("Są ");
        }
    }
}
