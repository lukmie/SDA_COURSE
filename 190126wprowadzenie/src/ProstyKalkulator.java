public class ProstyKalkulator {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        System.out.println(getSum(x, y));
        System.out.println(getSum(x, y, y));

    }

    public static long getSum(int a, int b) {
        return a + b;
    }

    public static long getSum(int a, int b, int c) {
        return a + b + c;
    }
}
