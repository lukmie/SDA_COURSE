package com.javagda23.visualvm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Ticket> ticketList = null;

        String komenda;
        do {
            System.out.println("Komenda: ");
            komenda = sc.next();

            if (komenda.equalsIgnoreCase("dodaja")){
                int ilosc = sc.nextInt();
                ticketList = dodajDoAL(ilosc);
            } else if(komenda.equalsIgnoreCase("dodajl")){
                int ilosc = sc.nextInt();
                ticketList = dodajDoLL(ilosc);
            } else if (komenda.equalsIgnoreCase("czysc")){
                ticketList.clear();
            } else if (komenda.equalsIgnoreCase("iteruj")){
                iteruj(ticketList);
            } else if (komenda.equalsIgnoreCase("gc")){
                Runtime.getRuntime().gc();
            }
        } while (!komenda.equalsIgnoreCase("quit"));
    }

    public static List<Ticket> dodajDoAL(int liczba){
        List<Ticket> ticketList = new ArrayList<>();
        for (int i = 0; i < liczba; i++) {
            ticketList.add(new Ticket(i));
        }
        return ticketList;
    }

    public static List<Ticket> dodajDoLL(int liczba){
        List<Ticket> ticketList = new LinkedList<>();
        for (int i = 0; i < liczba; i++) {
            ticketList.add(new Ticket(i));
        }
        return ticketList;
    }

    public static void iteruj(List<Ticket> list){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).getId();
        }
        Scanner sc = new Scanner(System.in);
        String komenda;
        do {
            System.out.println("Komenda: ");
            komenda = sc.next();

        } while (!komenda.equalsIgnoreCase("quit"));
    }
}
