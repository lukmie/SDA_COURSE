import java.util.Scanner;

public class PrzykladIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int naszaLiczba = Integer.parseInt(scanner.nextLine());

        if(naszaLiczba < 10){
            System.out.println("Nasza liczba jest mniejsza od 10");
        } else if (naszaLiczba == 10) {
            System.out.println("Nasza liczba jest rowna 10");
        } else {
            System.out.println("Nasza liczba jest wieksza od 10");
        }

        System.out.println("Wpisz cyfre od 0 do 9: ");
        int number = Integer.parseInt(scanner.nextLine());
        if(number == 0){
            System.out.println(")");
        } else if (number == 1) {
            System.out.println("!");
        } else if (number == 2) {
            System.out.println("@");
        } else if (number == 3) {
            System.out.println("#");
        } else if (number == 4) {
            System.out.println("$");
        } else if (number == 5) {
            System.out.println("%");
        } else if (number == 6) {
            System.out.println("^");
        } else if (number == 7) {
            System.out.println("&");
        } else if (number == 8) {
            System.out.println("*");
        } else if (number == 9) {
            System.out.println("(");
        }


        System.out.println("Wpisz znak: ");
        String word = scanner.next();

        if(word.equals("prawy nawias")){
            System.out.println(")");
        } else if (word.equals("wykrzyknik")) {
            System.out.println("!");
        } else if (word.equals("malpka")) {
            System.out.println("@");
        } else if (word.equals("hash")) {
            System.out.println("#");
        } else if (word.equals("dolar")) {
            System.out.println("$");
        } else if (word.equals("procent")) {
            System.out.println("%");
        } else if (word.equals("daszek")) {
            System.out.println("^");
        } else if (word.equals("and")) {
            System.out.println("&");
        } else if (word.equals("gwiazdka")) {
            System.out.println("*");
        } else if (word.equals("lewy nawias")) {
            System.out.println("(");
        }
    }

}
