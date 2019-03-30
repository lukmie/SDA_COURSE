package com.javagda23.zad2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Tuba<T> {
    private Stack<T> tuba = new Stack<>();

//    public Tuba(Stack<T> tuba) {
//        this.tuba = tuba;
//    }

    public void addItem(T e){
        System.out.println("Wloz: " + e);
        tuba.push(e);
    }

    public T popItem(){
        T popped = tuba.pop();
        System.out.println("Wyciagnij: " + popped);

        return popped;
    }



}
