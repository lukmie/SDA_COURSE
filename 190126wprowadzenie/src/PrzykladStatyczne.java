public class PrzykladStatyczne {
    static int d = 5;
    static int c = 3;

    public static void main(String[] args) {
        System.out.println(d);
        System.out.println(PrzykladStatyczne.d);
        System.out.println(Math.PI);
        PrzykladStatyczne ps = new PrzykladStatyczne();
        System.out.println(ps.c);

        Towar t1 = new Towar("towar1");
        System.out.println(t1.getNumerKTowaru());

        Towar t2 = new Towar("towar1");
        System.out.println(t2.getNumerKTowaru());
    }

    public static int add(int x, int y) {
        return c + d;
    }
}

class Towar {
    private static int numerTowaru;
    private int numerKTowaru = numerTowaru++;
    private String nazwa;

    public Towar(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getNumerKTowaru() {
        return numerKTowaru;
    }
    public String getNazwa() {
        return nazwa;
    }

}
