package com.javagda23.adapter.zad1;

import com.javagda23.adapter.zad1.systema.SystemAUser;
import com.javagda23.adapter.zad1.systema.SystemAUserAdapter;

import java.util.Arrays;

public class AdapterDemo {
    public static void main(String[] args) {
        SystemAUser systemAUser = new SystemAUser("Jan", "Nowak", 22L, Arrays.asList("USER"));

        final User user = new SystemAUserAdapter(systemAUser);

    }
}
