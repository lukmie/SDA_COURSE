package com.javagda23.adapter.zad1.systemb;

import com.javagda23.adapter.zad1.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SystemBUserAdapter implements User {

    private SystemBUser systemBUser;

    public SystemBUserAdapter(SystemBUser systemBUser) {
        this.systemBUser = systemBUser;
    }

    @Override
    public String getFullName() {
        return systemBUser.getFullName();
    }

    @Override
    public String getUsername() {
        return systemBUser.getDisplayName();
    }

    @Override
    public Integer getAge() {
        return Integer.parseInt(systemBUser.getAge());
    }

    @Override
    public List<String> getRoles() {
//        return systemBUser.getRoles().stream().collect(Collectors.toList());
        return new ArrayList<>(systemBUser.getRoles());
    }
}
