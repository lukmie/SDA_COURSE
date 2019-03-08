import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = "Lukasz";
        String name2 = "Paulina";
        System.out.print("Hello " + name1 + "\n");

        System.out.print("Hello " + name2);

        double d = 2.2260225;
        System.out.println();
        System.out.printf("double : %.2f", d);


        System.out.printf("\n%15s\n%15s\n%15s\n", "test", "t", "wprowadzenie");

        System.out.println();
        System.out.printf("%02X:%02X:%02X:%02X", 192, 168,1,10);




    }

}
