package com.javagda23.zad8;

public class Customer implements Comparable<Customer> {
    private int age;
    private boolean isPregnant;
    private String name;

    public Customer(int age, boolean isPregnant, String name) {
        this.age = age;
        this.isPregnant = isPregnant;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                ", isPregnant=" + isPregnant +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
//        if (isPregnant && o.isPregnant) {
//            return 0;
//        } else if (isPregnant && !o.isPregnant) {
//            return -1;
//        } else if (!isPregnant && o.isPregnant) {
//            return 1;
//        }
//        if (age > 60 && o.age > 60) {
//            return 0;
//        } else if (age > 60 && o.age < 60) {
//            return -1;
//        } else if (age < 60 && o.age > 60) {
//            return 1;
//        }
//
//        return 0;



        if (o.isPregnant) {
            return 1;
        } else if (isPregnant){
            return -1;
        }
        if (age == o.age){
            return 0;
        } else {
            if (o.age > 60){return 1;}
            if (age > 60){return -1;}
        }

        return 0;
    }
}
