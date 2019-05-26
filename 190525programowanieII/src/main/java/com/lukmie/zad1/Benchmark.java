package com.lukmie.zad1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Benchmark {
    private static final int ITERATIONS = 1_000;
    public static void benchmarkArrayListAdd(){
        long time = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            List<String> list = new ArrayList<>();
            prepareList(list, 1_000_000);

            long start = System.nanoTime();

            list.add("benchmarkAL");

            long end = System.nanoTime();

            time += (end - start);
        }
        System.out.println("ArrayList adding operation: " + time/ITERATIONS);
    }

    public static void benchmarkLinkedListAdd(){
        long time = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            List<String> list = new LinkedList<>();
            prepareList(list, 1_000_000);

            long start = System.nanoTime();

            list.add("benchmarkLL");

            long end = System.nanoTime();

            time += (end - start);
        }
        System.out.println("LinkedList adding operation: " + time/ITERATIONS);
    }


    public static void benchmarkArrayListAddAtIndex(){
        long time = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            List<String> list = new ArrayList<>();
            prepareList(list, 1_000_000);

            long start = System.nanoTime();

            list.add(500_000, "benchmarkAL");

            long end = System.nanoTime();

            time += (end - start);
        }
        System.out.println("ArrayList adding at index operation: " + time/ITERATIONS);
    }

    public static void benchmarkLinkedListAddAtIndex(){
        long time = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            List<String> list = new LinkedList<>();
            prepareList(list, 1_000_000);

            long start = System.nanoTime();

            list.add(500_000, "benchmarkAL");

            long end = System.nanoTime();

            time += (end - start);
        }
        System.out.println("LinkedList adding at index operation: " + time/ITERATIONS);
    }

    public static void benchmarkArrayListRemoveObject(){
        long time = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            List<String> list = new ArrayList<>();
            prepareList(list, 1_000_000);

            long start = System.nanoTime();

            list.remove("testListy");

            long end = System.nanoTime();

            time += (end - start);
        }
        System.out.println("ArrayList removing object operation: " + time/ITERATIONS);
    }

    public static void benchmarkLinkedListRemoveObject(){
        long time = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            List<String> list = new LinkedList<>();
            prepareList(list, 1_000_000);

            long start = System.nanoTime();

            list.remove("testListy");

            long end = System.nanoTime();

            time += (end - start);
        }
        System.out.println("LinkedList removing object operation: " + time/ITERATIONS);
    }

    public static void benchmarkArrayListRemoveAtIndex(){
        long time = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            List<String> list = new ArrayList<>();
            prepareList(list, 1_000_000);

            long start = System.nanoTime();

            list.remove(500_000);

            long end = System.nanoTime();

            time += (end - start);
        }
        System.out.println("ArrayList removing object at index operation: " + time/ITERATIONS);
    }

    public static void benchmarkLinkedListRemoveAtIndex(){
        long time = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            List<String> list = new LinkedList<>();
            prepareList(list, 1_000_000);

            long start = System.nanoTime();

            list.remove(500_000);

            long end = System.nanoTime();

            time += (end - start);
        }
        System.out.println("LinkedList removing object at index operation: " + time/ITERATIONS);
    }

    public static void benchmarkArrayListGetObject(){
        long time = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            List<String> list = new ArrayList<>();
            prepareList(list, 1_000_000);

            long start = System.nanoTime();

            list.get(500_000);

            long end = System.nanoTime();

            time += (end - start);
        }
        System.out.println("ArrayList get object at index operation: " + time/ITERATIONS);
    }

    public static void benchmarkLinkedListGetObject(){ //consumer supplier
        long time = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            List<String> list = new LinkedList<>();
            prepareList(list, 1_000_000);

            long start = System.nanoTime();

            list.get(500_000);

            long end = System.nanoTime();

            time += (end - start);
        }
        System.out.println("LinkedList get object at index operation: " + time/ITERATIONS);
    }

    private static List<String> prepareList(List<String> list, int size){
        for (int i = 0; i < size; i++) {
            list.add("testListy");
        }
        return list;
    }
}
