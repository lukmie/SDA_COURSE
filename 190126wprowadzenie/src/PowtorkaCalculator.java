import java.util.Scanner;

public class PowtorkaCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operation;
        String quit;

        while(true){
            System.out.println("Input first number: ");
            double x = Double.parseDouble(sc.next());
            System.out.println("Input second number: ");
            double y = Double.parseDouble(sc.next());

            System.out.println("Choose operation: ADD/SUB/MUL/DIV");
            operation = sc.next().toUpperCase();

            switch (operation) {
                case "ADD":
                    System.out.printf("%.2f\n%5s\n%.2f\n%5s\n%.2f\n", x, "+", y, "=", (x + y));
                    break;
                case "SUB":
                    System.out.printf("%.2f\n%5s\n%.2f\n%5s\n%.2f\n", x, "-", y, "=", (x - y));
                    break;
                case "MUL":
                    System.out.printf("%.2f\n%5s\n%.2f\n%5s\n%.2f\n", x, "*", y, "=", (x * y));
                    break;
                case "DIV":
                    if (y == 0) {
                        System.out.println("Error, dividing by zero. Input different number:");
                        double notZero = Double.parseDouble(sc.next());
                        System.out.printf("%.2f\n%5s\n%.2f\n%5s\n%.3f\n", x, "/", notZero, "=", (x / notZero));
                    } else {
                        System.out.printf("%.2f\n%5s\n%.2f\n%5s\n%.3f\n", x, "/", y, "=", (x / y));
                    }
                    break;
            }

            System.out.println("Do you want to quit? Y/N");
            quit = sc.next().toUpperCase();
            if(quit.equals("Y")){
                System.out.println("Goodbye :)");
                break;
            }
        }

//        while(true){
//            System.out.println("Input first number: ");
//            double x = Double.parseDouble(sc.next());
//            System.out.println("Input second number: ");
//            double y = Double.parseDouble(sc.next());
//
//            System.out.println("Choose operation: ADD/SUB/MUL/DIV");
//            operation = sc.next().toUpperCase();
//
//            /*System.out.printf(operation.equals("ADD")
//                    ? String.format("%.2f\n%5s\n%.2f\n%5s\n%.2f\n", x, "+", y, "=", (x + y))
//                    : String.format("%.2f\n%5s\n%.2f\n%5s\n%.2f\n", x, "-", y, "=", (x - y)));*/
//            if(operation.equals("ADD")){
//                System.out.printf("%.2f\n%5s\n%.2f\n%5s\n%.2f\n", x, "+", y, "=", (x + y));
//            } else if(operation.equals("SUB")){
//                System.out.printf("%.2f\n%5s\n%.2f\n%5s\n%.2f\n", x, "-", y, "=", (x - y));
//            }
//            switch (operation) {
//                case "MUL":
//                    System.out.printf("%.2f\n%5s\n%.2f\n%5s\n%.2f\n", x, "*", y, "=", (x * y));
//                    break;
//                case "DIV":
//                    if (y == 0) {
//                        System.out.println("Error, dividing by zero. Input different number:");
//                        double notZero = Double.parseDouble(sc.next());
//                        System.out.printf("%.2f\n%5s\n%.2f\n%5s\n%.3f\n", x, "/", notZero, "=", (x / notZero));
//                    } else {
//                        System.out.printf("%.2f\n%5s\n%.2f\n%5s\n%.3f\n", x, "/", y, "=", (x / y));
//                    }
//                    break;
//            }
//
//            System.out.println("Do you want to quit? Y/N");
//            quit = sc.next().toUpperCase();
//            if(quit.equals("Y")){
//                System.out.println("Goodbye :)");
//                break;
//            }
//        }






















    }

}
