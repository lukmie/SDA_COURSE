package com.javagda23.zad8;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy();
        Customer c1 = new Customer(70, false, "a70");
        Customer c2 = new Customer(27, true, "b27");
        Customer c3 = new Customer(15, false, "c15");
        Customer c4 = new Customer(31, true, "d31");
        Customer c5 = new Customer(162, false, "a62");

        p1.addCustomer(c1);
        p1.addCustomer(c2);
        p1.addCustomer(c3);
        p1.addCustomer(c4);
        p1.addCustomer(c5);
        Collections.sort(p1.getLine());
        p1.printLine();
    }
}
