package com.javagda23.creational.singleton.zad3;

import java.util.HashMap;
import java.util.Map;

public enum UserRepository {
    INSTANCE;

    private Map<String, String> usernamesToEmails = new HashMap<>();

    public Map<String, String> getUsernamesToEmails() {
        return usernamesToEmails;
    }

    public void addUser(String username, String email){
        usernamesToEmails.put(username, email);
    }
}
