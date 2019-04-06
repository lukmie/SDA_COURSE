package com.javagda23.creational.singleton;

import com.javagda23.creational.singleton.zad2.AppConnections;

public class SingletonDemo {
    public static void main(String[] args) {
//        Counter c1 = Counter.getInstance(); // pobieranie referencji do instancji, do singletona
//        Counter c2 = Counter.getInstance();
//        c1.add2();
//        c2.add3();
//        c1.add1();
//        c2.add2();

        AppConnections appConnections1 = AppConnections.getInstance();
        AppConnections appConnections2 = AppConnections.getInstance();
        appConnections1.connectUser("Robert");
        appConnections2.connectUser("Agata");
        System.out.println(appConnections1.getConnectedUsers());
    }
}
