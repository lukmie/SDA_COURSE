import java.util.Scanner;

public class ZadPowt57_137 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tab = {"kombinerki", "nozyczki", "srubokret"};


        System.out.println("Input your name: ");
        String name = sc.nextLine();

        System.out.printf("Hello %s!%nIn our offer we've got: %n-%s, %n-%s, %n-%s.%nWhat would you like to buy?%n", name, tab[0], tab[1], tab[2]);

        String choice = sc.nextLine();

        switch (choice){
            case "kombinerki":
                System.out.println("Kupiles kombinerki.");
                String[] tabCopy1 ={"nozyczki", "srubokret"};
                System.out.printf("In our offer we've got: %n-%s, %n-%s.%nWhat would you like to buy?", tabCopy1[0], tabCopy1[1]);
                break;
            case "nozyczki":
                System.out.println("Kupiles nozyczki.");
                String[] tabCopy2 ={"kombinerki", "srubokret"};
                System.out.printf("In our offer we've got: %n-%s, %n-%s.%nWhat would you like to buy?", tabCopy2[0], tabCopy2[1]);
                break;
            case "srubokret":
                System.out.println("Kupiles srubokret.");
                String[] tabCopy3 ={"nozyczki", "kombinerki"};
                System.out.printf("In our offer we've got: %n-%s, %n-%s.%nWhat would you like to buy?", tabCopy3[0], tabCopy3[1]);
                break;
            default:
                System.out.println("Brak asortymentu.");
        }
    }

}
