import java.util.Scanner;

public class RysowanieFigur {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int size = Integer.parseInt(sc.nextLine());
        int size = 5;

//        for (int i = 0; i < size; i++) {
////            for (int j = 0; j < size; j++) {
////
//////                if(i == 0 || i == size-1 || j == 0 || j == size-1 || i == j || i == size-1-j){
//////                    System.out.print(" *");
//////                } else {
//////                    System.out.print("  ");
//////                }
////                if( j == 0 ||  j != i || i == size-1){
////                    System.out.print("*");
////                } else {
////                    System.out.print(" ");
////                }
////
////
////
////            }
////            System.out.println();
////        }

        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
             }
            System.out.println();
        }
    }

}
