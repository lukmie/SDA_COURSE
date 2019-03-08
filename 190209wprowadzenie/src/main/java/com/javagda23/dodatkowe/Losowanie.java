package com.javagda23.dodatkowe;


import java.util.Random;
import java.util.Scanner;

public class Losowanie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int n = random.nextInt(200) + 10;
        System.out.println(n);

        System.out.println("Czy liczba A > 100 [Y/N]");
        String answer = sc.nextLine();
        if(answer.equals("Y")){
            if(n>100){
                System.out.println("trafiles");
            } else{
                System.out.println("nie trafiles");
            }
        } else{
            if(n>100){
                System.out.println("trafiles");
            } else{
                System.out.println("nie trafiles");
            }
        }
    }
}
