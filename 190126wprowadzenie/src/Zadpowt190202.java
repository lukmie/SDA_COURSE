
import java.util.Scanner;

public class Zadpowt190202 {

    public static void main(String[] args) {
//        1
//        for (int i = 0; i < 11; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 10; i >= 0; i--) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < 11; i++) {
//            if(i%2 == 0){
//                System.out.println(i);
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < 11; i++) {
//            if(i%3 == 0){
//                System.out.print(i + " ");
//            }
//        }

//        2
        Scanner sc = new Scanner(System.in);
        String text;
//        Double d = 0.0;
//        while(true){
//            System.out.println("Podaj tekst: ");
//            text = sc.nextLine();
//            if(text.equals("koniec")){
//                break;
//            } else if(text.equals("kontynuuj")){
//                continue;
//            } else if(text.matches("-?\\d+(\\.\\d+)?")){
//                System.out.println(text + " otrzymałem liczbę");
//                d = Double.valueOf(text);
//                for (int i = 0; i < 6; i++) {
//                    System.out.println(d+i);
//                }
//            }
//            else System.out.println(text);
//        }
//          wersja Marek Bobcow:
//        Scanner scanner = new Scanner(System.in);
//        String text;
//        while(true) {
//            System.out.println("Podaj dowolny tekst: ");
//            text = scanner.nextLine();
//            if (text.equals("koniec")) {
//                break;
//            } else if (text.equals("kontynuuj")) {  // na potrzeby podpunktu a
//                continue;
//            }
//            System.out.println("Twój tekst to: " + text);
//            // od tego momentu mamy b
//            int value;
//            try {
//                value = Integer.parseInt(text);
//            } catch (NumberFormatException ex) {
//                System.out.println("To nie była wartość liczbowa!");
//                continue;
//            }
//            System.out.println("Otrzymałem liczbę! 5 kolejnych wartości to: ");
//            // i od tego momentu mamy c
//            for (int i = value + 1; i < value + 6; i++) {
//                System.out.println(i);
//            }
//        }



//        3
//        double[] tab = new double[5];
//        System.out.println("Give 5 numbers: ");
//        for (int i = 0; i < 5; i++) {
//            tab[i] = Double.parseDouble(sc.nextLine());
//        }
//        for (double d : tab) {
//            System.out.printf("%.2f; ", d);
//        }

//        4
//        String s = "Ala ma kota, kot ma Alę.";
//        String s1, s2;
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//
//        if(s.contains("Ala")){
//            s1 = s.replace("Ala", "Jan");
//            s2 = s1.replace("Alę", "Jana");
//            System.out.println(s2);
//        }
//        System.out.println(s.replace("Ala", "Jan").replace("Alę", "Jana"));


//        5
//        5a
//        System.out.println("Podaj rozmiar kwadratu: ");
//        int size = Integer.parseInt(sc.nextLine());
//        for (int wiersz = 0; wiersz < size; wiersz++) {
//            for (int kolumna = 0; kolumna < size; kolumna++) {
//                    System.out.print(" *");                     // rysuj gwiazdkę
//            }
//            System.out.println();
//        }
//        5b
//        System.out.println("Podaj rozmiar u: ");
//        int size = Integer.parseInt(sc.nextLine());
//        for (int wiersz = 0; wiersz < size; wiersz++) {
//            for (int kolumna = 0; kolumna < size; kolumna++) {
//                if (wiersz == size - 1           // dla pierwszego lub ostatniego wiersza
//                        || kolumna == 0 || kolumna == size - 1  // lub dla pierwszej lub ostaniej kolumny
//                ) {
//                    System.out.print(" *");                     // rysuj gwiazdkę
//                } else {
//                    System.out.print("  ");                     // w pozostałych wypadkach rysuj spację
//                }
//            }
//            System.out.println();
//        }
//        5c
//        System.out.println("Podaj rozmiar x: ");
//        int size = Integer.parseInt(sc.nextLine());
//        for (int wiersz = 0; wiersz < size; wiersz++) {
//            for (int kolumna = 0; kolumna < size; kolumna++) {
//                if (wiersz == kolumna                    // lub dla pierwszej przekątnej
//                        || wiersz == size - 1 - kolumna         // lub dla drugiej przekątnej
//                ) {
//                    System.out.print(" *");                     // rysuj gwiazdkę
//                } else {
//                    System.out.print("  ");                     // w pozostałych wypadkach rysuj spację
//                }
//            }
//            System.out.println();
//        }
//        5d
//        System.out.println("Podaj rozmiar x co drugi: ");
//        int size = Integer.parseInt(sc.nextLine());
//        for (int wiersz = 0; wiersz < size; wiersz++) {
//            for (int kolumna = 0; kolumna < size; kolumna++) {
//                if(wiersz%2 == 0){
//                    if (wiersz == kolumna                           // lub dla pierwszej przekątnej
//                            || wiersz == size - 1 - kolumna         // lub dla drugiej przekątnej
//                    ) {
//                        System.out.print(" *");                     // rysuj gwiazdkę
//                    } else {
//                        System.out.print("  ");                     // w pozostałych wypadkach rysuj spację
//                    }
//                }
//
//            }
//            System.out.println();
//        }




//          wersja Marek Bobcow:
//        int size = 10;
//        // a
//        System.out.println("Kwadrat pełen gwiazdek");
//        for (int row = 0; row < size; row++) {
//            for (int column = 0; column < size; column++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        // b
//        System.out.println("\nLitera U");
//        for (int row = 0; row < size; row++) {
//            for (int column = 0; column < size; column++) {
//                if (row == size - 1 || column == 0 || column == size - 1) {
//                    System.out.print(" *");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        // c
//        System.out.println("\nLitera X z rozmiarem zadanym przez użytkownika");
//        System.out.println("Podaj rozmiar litery X: ");
//        size = Integer.parseInt(sc.nextLine());
//        for (int row = 0; row < size; row++) {
//            for (int column = 0; column < size; column++) {
//                if (row == column || row == size - column - 1) {
//                    System.out.print(" *");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        // d
//        System.out.println("\nLitera X co druga wartość");
//        for (int row = 0; row < size; row++) {
//            for (int column = 0; column < size; column++) {
//                if ((row == column || row == size - column - 1) && (row % 2 == 0)) {
//                    System.out.print(" *");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
    }


}
