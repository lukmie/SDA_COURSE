package com.javagda23.zad15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ParaLiczb pl = new ParaLiczb(1,2);
        ParaLiczb p2 = new ParaLiczb(1,2);

        Set<ParaLiczb> set = new HashSet<>(Arrays.asList(pl, p2));
    }
}
