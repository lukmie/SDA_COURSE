import java.util.Scanner;

public class Zadpowt190203 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input add/subtract");
//        String operation = sc.nextLine();
////        String operation = args[1];
//        System.out.println(operation);
//        System.out.println("Input a:");
//        int a = Integer.parseInt(sc.nextLine());
//        System.out.println("Input b:");
//        int b = Integer.parseInt(sc.nextLine());
//        switch (operation) {
//            case "add":
//                System.out.println(add(a, b));
//                break;
//            case "subtract":
//                System.out.println(subtract(a, b));
//                break;
//            default:
//                break;
//        }
        Portfel p = new Portfel("skora", "witchen", 3);
        System.out.println(p.sprawdzStan());
        p.zasil(0, 0, 3, 1000);
        System.out.println(p.sprawdzStan());
        p.kup(10000);
        System.out.println(p.sprawdzStan());
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

}

class Portfel {
    private String material;
    private String marka;
    private int rozmiar;
    private int stan;
    private int b10 = 10;
    private int b20 = 20;
    private int b50 = 50;
    private int kartaPlatnicza = 0;


    public Portfel(String material, String marka, int rozmiar) {
        this.material = material;
        this.marka = marka;
        this.rozmiar = rozmiar;
        this.stan = 0;
    }

    public int sprawdzStan() {
        return stan;
    }

    public int zasil(int b1, int b2, int b5, int kp) {
        stan = stan + b1 * this.b10 + b2 * this.b20 + b5 * this.b50 + kp;
        return stan;
    }

    public void kup(int kwota) {
        if (sprawdzStan() < kwota) {
            System.out.println("Brak kwoty");
        } else {
            stan = stan - kwota;
        }

    }


}
