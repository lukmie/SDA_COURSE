package com.javagda23.zad8;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {
    List<Customer> line = new ArrayList<>();

    public Pharmacy() {
    }

    public List<Customer> getLine() {
        return line;
    }

    public void addCustomer(Customer customer){
        line.add(customer);
    }

    public void printLine(){
        for (Customer customer : line) {
            System.out.println(customer);
        }
    }
}
