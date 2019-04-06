package com.javagda23.structural.adapter.zad1;

import com.javagda23.structural.adapter.zad1.systema.SystemAUser;
import com.javagda23.structural.adapter.zad1.systema.SystemAUserAdapter;
import com.javagda23.structural.adapter.zad1.systemb.SystemBUser;
import com.javagda23.structural.adapter.zad1.systemb.SystemBUserAdapter;

import java.util.Arrays;
import java.util.Collections;

public class AdapterDemo {
    public static void main(String[] args) {
        final SystemAUser systemAUser = new SystemAUser("Jan", "Nowak", 22L, Arrays.asList("USER"));
        final SystemBUser systemBUser = new SystemBUser("Adam Adamski", "AdamA", "23", Collections.singleton("ADMIN"));

        final User user = new SystemAUserAdapter(systemAUser);
        System.out.println(user);

        System.out.println(new SystemAUserAdapter(systemAUser).getFullName());
        System.out.println(new SystemBUserAdapter(systemBUser).getRoles());

    }
}
