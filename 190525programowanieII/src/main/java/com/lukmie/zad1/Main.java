package com.lukmie.zad1;



public class Main {
    public static void main(String[] args) throws Exception {
        MyList myList = new MyList();
        myList.add("a");
        myList.add("b");
        myList.add("d");
        myList.add("c");

        System.out.println(myList.search("b"));
        System.out.println();
    }
}
