package com.javagda23.behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserRepository {
    private List<UserData> userDataList = new ArrayList<>();

    public void addUser(UserData userData){
        if (!userDataList.contains(userData)) {
            userDataList.add(userData);
        }
    }

    public void removeUser(UserData userData){
        userDataList.remove(userData);
    }

    public List<UserData> getUserDataList() {
        return userDataList;
    }

    @Override
    public String toString() {
//        userDataList.forEach(s -> System.out.println(s.getName()));
        return userDataList.stream()
                .map(userData -> userData.getName() + " " + userData.getSurname() + " ")
                .collect(Collectors.joining());
    }
}
