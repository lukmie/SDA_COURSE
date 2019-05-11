package com.lukmie.zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cenaSMS = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz tresc sms-a:");
        String text = sc.nextLine();

        String[] tabText = text.split(" ");


        for (int i = 0; i < tabText.length; i++) {
            if (tabText[i].isEmpty()){
                continue;
            }
            String x = tabText[i].substring(0,1).toUpperCase()+tabText[i].substring(1);
            System.out.print(x);
        }
        System.out.println();
//        if (text.length() <= 160){
//            System.out.println("1 zl");
//        }

        int liczbaSMS = ((text.length() - 160)/153+1);

        if (text.length() > 0 && text.length() <= 1377){
            System.out.println((1 + liczbaSMS*cenaSMS) + " zl");
        } else if (text.length() > 1377){
            System.out.println("Sms za dlugi");
        }

    }
}
