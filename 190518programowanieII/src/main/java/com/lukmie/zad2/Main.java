package com.lukmie.zad2;

public class Main {
    public static void main(String[] args) {
        Thread jas = new Thread(new Jas());
        Thread malgosia = new Thread(new Malgosia());

        jas.start();
        malgosia.start();
        try {
            jas.join();
            malgosia.join();
        } catch (Exception ex) {
            System.out.println("Exception has been caught" + ex);
        }

        System.out.println("Koniec dnia");
    }
}
