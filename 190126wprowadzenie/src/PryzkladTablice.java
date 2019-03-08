import java.util.Scanner;

public class PryzkladTablice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*1*/
//        int size = 5;
//        String[] lista = new String[size];
//
//        int i = 0;
//        while(i < lista.length) {
//            lista[i] = sc.nextLine();
//            i++;
//        }
//        for (int j = 0; j <  lista.length; j++) {
//            System.out.println("    - " + lista[j]);
//        }
//        for (String produkt : lista) {
//            System.out.println("    - " + produkt);
//        }

/*2*/
//        int size = Integer.parseInt(sc.nextLine());
//        int[] table = new int[size];
//        int sum = 0;
//        for (int i = 0; i < size; i++) {
//            table[i] = Integer.parseInt(sc.nextLine());
//            sum += table[i];
//        }
//        System.out.println(sum);
//        System.out.println(table);


/*3*/
//        String[] names = {"Jan", "Malgorzata", "Adam", "Paweł", "Kamila"};
//        for (String name: names) {
//            System.out.printf("%s, ",name);
//        }

/*4*/
//        String[] names = {"Jan", "Malgorzata", "Adam", "Paweł", "Kamila"};
//        for (String name: names) {
//            if(name.length() < 5){
//                System.out.printf("%s, ",name);
//            }
//        }

//        1
        double[] tab = {1, 2, 3, 4, 5, 6};
//        a

        double max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if(max < tab[i]){
                max = tab[i];
            }
        }
        System.out.println("Maximum: " + max);

//        b
        double min = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if(min > tab[i]){
                min = tab[i];
            }
        }
        System.out.println("Minimum: " + min);

//        c
        double sum = 0;

        for (double cell: tab) {
            sum += cell;
        }
        System.out.println("Sum: " + sum);

//        d
        System.out.println("Average: " + (sum/tab.length));

//        e
        double med = 0;

        if(tab.length%2 == 0){
            med = (tab[tab.length/2 - 1] + tab[tab.length/2])/2;
        } else {
            med = tab[tab.length/2 - 1];
        }
        System.out.println("Median: " + med);



    }

}
