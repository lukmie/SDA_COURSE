package com.javagda23.structural.proxy.zad2;


import com.javagda23.structural.proxy.zad2.security.*;

import java.time.LocalDate;

public class SecurityProxyDemo {
    public static void main(String[] args) {
        Person admin = new Person("Jan", "ss", "23", LocalDate.now(), Role.ADMIN, 2, true);
        PersonManager personManager = new PersonManagerProxy(admin);

        Person otherGuy = new Person("Janisz", "sssssssssss", "23", LocalDate.now(), Role.ADMIN, 2, true);

        personManager.addPerson(otherGuy);

        System.out.println(personManager.getAllPeople().size());


    }
}
