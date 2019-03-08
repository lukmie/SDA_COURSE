import java.util.Scanner;

public class PrzykladSwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Podaj naszą liczbę: ");
//        int naszaLiczba = Integer.parseInt(scanner.nextLine());
//
//        switch(naszaLiczba){
//            case 10:
//                System.out.println("Nasza liczba jest rowna 10");
//                break;
//            case 100:
//                System.out.println("Nasza liczba jest rowna 100");
//                break;
//            default:
//                System.out.println("Liczba nie jest 10 ani 100");
//                break;
//        }


//        System.out.println("Podaj number: ");
//        int number = Integer.parseInt(scanner.nextLine());
//        switch(number){
//            case 0:
//                System.out.println(")");
//                break;
//            case 1:
//                System.out.println("!");
//                break;
//            default:
//                System.out.println("*");
//                break;
//        }

        System.out.println("Type a word: ");
        String word = scanner.nextLine();
        switch(word){
            case "trener":
                System.out.println(")");
                break;
            case "uczen":
                System.out.println("!");
                break;
            default:
                System.out.println("*");
                break;
        }

//        System.out.println("Type a word: ");
//        String wordError = scanner.nextLine();
//        switch(wordError){
//            case "trener":
//                System.out.println(")");
//            case "uczen":
//                System.out.println("!");
//            default:
//                System.out.println("*");
//                break;
//        }
    }

}
