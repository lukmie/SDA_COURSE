package com.javagda23.zad4_tddRownanieKwadratowe;

public class RownanieKwadratowe {
    public static String oblicz(int a, int b, int c) {
//        int delta = b * b - 4 * a * c;
//        if (delta == 0) return "1";
//        if (delta > 0) return "-4,-1";
//        return "";

        double delta = b * b - 4 * a * c;
        double sqrtDelta = Math.sqrt(delta);
        if (delta < 0) return "";
        int x1 = -b/(2*a);
        if (delta == 0) return Integer.toString(x1);
        double x11 = (double)-b/(2*a)-sqrtDelta/(2*a);
        double x12 = (double)-b/(2*a)+sqrtDelta/(2*a);
        if (delta > 0) return (int)x11+","+(int)x12;
        return "";
    }
}
