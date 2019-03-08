import java.util.Scanner;

public class PrzykladWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String produkt;
        String word;
        int number;
        int sum = 0;

        int i = 0;
//        while(i < 11) {
//            produkt = sc.nextLine();
//            System.out.printf("Dodalem do koszyka %s, to nasz %d produkt!%n", produkt, i+1);
//            i++;
//        }

//        i = 0;
//        while(i < 5) {
//            number = Integer.parseInt(sc.nextLine());
//            sum += number;
//            i++;
//        }
//        System.out.println("sum = " + sum);

//        i = 0;
//        while(i < 5) {
//            number = Integer.parseInt(sc.nextLine());
//            i++;
//            if(number < 10){
//                continue;
//            }
//            sum += number;
//        }
//        System.out.println("sum = " + sum);

//        i = 0;
        while(true) {
            word = sc.nextLine();
            if(word.equals("koniec")){
                break;
            }
        }

        while(true) {
            word = sc.nextLine();
            if(word.equals("koniec")){
                System.out.println("Zakonczyles wpisywanie produktow.");
                break;
            }
        }

    }

}
