package com.javagda23.structural.adapter.zad1.systema;

import com.javagda23.structural.adapter.zad1.User;

import java.util.List;

public class SystemAUserAdapter implements User {
    // adaptee
    private SystemAUser systemAUser;

    public SystemAUserAdapter(SystemAUser systemAUser) {
        this.systemAUser = systemAUser;
    }

    @Override
    public String getFullName() {
        return systemAUser.getFirstName() + " " + systemAUser.getLastName();
    }

    @Override
    public String getUsername() {
        return systemAUser.getFirstName();
    }

    @Override
    public Integer getAge() {
        return Integer.valueOf(String.valueOf(systemAUser.getAge()));
    }

    @Override
    public List<String> getRoles() {
        return systemAUser.getRoles();
    }

    @Override
    public String toString() {
        return systemAUser.getFirstName() + " " + systemAUser.getLastName();
    }
}
