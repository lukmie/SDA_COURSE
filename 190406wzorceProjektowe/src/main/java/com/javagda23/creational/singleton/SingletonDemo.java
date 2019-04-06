package com.javagda23.creational.singleton;

import com.javagda23.creational.singleton.zad2.AppConnections;
import com.javagda23.creational.singleton.zad3.FBRegistrationService;
import com.javagda23.creational.singleton.zad3.GoogleRegistrationService;
import com.javagda23.creational.singleton.zad3.UserRepository;

public class SingletonDemo {
    public static void main(String[] args) {
//        Counter c1 = Counter.getInstance(); // pobieranie referencji do instancji, do singletona
//        Counter c2 = Counter.getInstance();
//        c1.add2();
//        c2.add3();
//        c1.add1();
//        c2.add2();

//        AppConnections appConnections1 = AppConnections.getInstance();
//        AppConnections appConnections2 = AppConnections.getInstance();
//        appConnections1.connectUser("Robert");
//        appConnections2.connectUser("Agata");
//        System.out.println(appConnections1.getConnectedUsers());

        GoogleRegistrationService googleRegistrationService = new GoogleRegistrationService();
        googleRegistrationService.register("Alabala", "ala@gmail.com");
        googleRegistrationService.register("Mela", "mela@gmail.com");
        googleRegistrationService.register("Cela", "cela@gmail.com");

        FBRegistrationService fbRegistrationService = new FBRegistrationService();
        fbRegistrationService.register("Dela", "dela@gmail.com");
        fbRegistrationService.register("Ela", "ela@gmail.com");
        fbRegistrationService.register("Fela", "fela@gmail.com");

        System.out.println(UserRepository.INSTANCE.getUsernamesToEmails());
    }
}
