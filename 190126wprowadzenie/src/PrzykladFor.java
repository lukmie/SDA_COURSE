import java.util.Scanner;

public class PrzykladFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String produkt;

//1       for(int i = 1; i < 11; i++){
//            produkt = sc.nextLine();
//            System.out.println("Dodalem do koszyka " + produkt + ", to nasz " + i + " produkt!");
//        }

//2       int number;
//        int sum = 0;
//        for(int i = 0; i < 5; i++){
//            number = Integer.parseInt(sc.nextLine());
//            sum += number;
//        }
//        System.out.println(sum);

//3       for(int i = 0; i < 5; i++){
//            for(int j = 0; j < 5; j++){
//                System.out.println(i + ":" + j);
//            }
//        }
//        for(int i = 0; i < 3; i++){
//            System.out.print("*");
//            System.out.print("*");
//            System.out.print("*");
//            System.out.println();
//        }

//4       for(int i = 0; i < 5; i++){
//            for(int j = 0; j < 5; j++){
//                if(i==0 || i == 4 || j == 0 || j == 4){
//                    System.out.print(" *");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


//5
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i==0 || i == 5 - 1 || j == 0 || j == 5 - 1 || i == j || i == 5 - 1 - j){
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


}
