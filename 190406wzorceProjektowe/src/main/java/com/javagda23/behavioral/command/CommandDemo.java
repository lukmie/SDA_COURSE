package com.javagda23.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        final UserRepository userRepository = new UserRepository();

        final UserData userA = new UserData("Ala", "Kot", "ala@makota.pl", "Kot_123");
        final UserData userB = new UserData("Andrzej", "Kviat", "andrzej@gmail.com", "Kwiat_123");

        final UserRegistrationCommand userRegistrationCommandA = new UserRegistrationCommand(userA, userRepository);
        final UserRegistrationCommand userRegistrationCommandB = new UserRegistrationCommand(userB, userRepository);

        userRegistrationCommandA.execute();
        userRegistrationCommandB.execute();
        System.out.println(userRepository);

        userRegistrationCommandA.undo();
        System.out.println(userRepository);

        userRegistrationCommandB.undo();
        System.out.println(userRepository);

        userRegistrationCommandA.execute();
        System.out.println(userRepository);
    }
}
