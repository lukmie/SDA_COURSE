package com.lukmie.zad5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static ExecutorService executor = Executors.newFixedThreadPool(1);
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        long start = System.nanoTime();
        File file = new File("src\\main\\resources\\numbers.txt");
        readFile(file);
        long end = System.nanoTime();


        System.out.println("time: " + (end - start)/1_000_000.0);
    }

    private static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
//        for (long i = 3; i < number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
        return true;
    }

    private static void readFile(File file) throws FileNotFoundException, InterruptedException {

        Scanner scanner = new Scanner(file);
        final AtomicInteger liczbyPierwsze = new AtomicInteger(0);
        while (scanner.hasNextLine()) {
            final String linia = scanner.nextLine();
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    if (isPrime(Long.parseLong(linia))){
                        System.out.println("dodano liczbe " + liczbyPierwsze.incrementAndGet());
                    }
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);
    }

}
