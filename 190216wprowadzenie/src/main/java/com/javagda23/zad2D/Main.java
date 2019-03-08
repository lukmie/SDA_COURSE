package com.javagda23.zad2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        MiejsceParkingowe miejsceParkingowe1 = new MiejsceParkingowe(0, StanMiejsca.WOLNE);
        MiejsceParkingowe miejsceParkingowe2 = new MiejsceParkingowe(1, StanMiejsca.WOLNE);
        MiejsceParkingowe miejsceParkingowe3 = new MiejsceParkingowe(2, StanMiejsca.ZAJETE);

        List<MiejsceParkingowe> lista = new ArrayList<>();
        lista.add(miejsceParkingowe1);
        lista.add(miejsceParkingowe2);
        lista.add(miejsceParkingowe3);

        Parking parking = new Parking(lista, true);

        Scanner sc = new Scanner(System.in);
        String polecenie;
        System.out.println("Wydaj polecenie sprawdz <nr>/zajmij <nr>");
        String[] s;
        do{
            polecenie = sc.nextLine();
            if(polecenie.equals("quit")){
                break;
            }
            s = polecenie.split(" ");
            String komenda = s[0];
            int numerMiejsca = Integer.parseInt(s[1]);
            switch (komenda) {
                case "sprawdz":
                    System.out.println(parking.sprawdzZajetoscMiejsca(numerMiejsca));
                    break;
//                case "zajmij":
//                    System.out.println(parking.zajmijMiejsce(numerMiejsca));
//                    break;
                default:
                    System.out.println("Bye");
            }
        } while(true);








//        System.out.println(parking.sprawdzZajetoscMiejsca(1));
//        System.out.println(parking.zajmijMiejsce(1));

    }
}
