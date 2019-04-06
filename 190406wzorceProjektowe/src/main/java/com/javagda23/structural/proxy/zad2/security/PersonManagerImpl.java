package com.javagda23.structural.proxy.zad2.security;

import java.util.ArrayList;
import java.util.List;

public class PersonManagerImpl implements PersonManager {

    private List<Person> people = new ArrayList<>();

    @Override
    public void addPerson(Person person) {

        final boolean isEmailDuplicated =  people.stream()
                .anyMatch(p -> person.getEmail().equals(p.getEmail()));
        if (isEmailDuplicated){
            throw new RuntimeException();
        }
        people.add(person);
    }

    @Override
    public void deletePerson(String email) {
        people.stream()
                .filter(person -> person.getEmail().equals(email))
                .findFirst()
                .ifPresent(person -> people.remove(person));
    }

    @Override
    public List<Person> getAllPeople() {
        return people;
    }

    @Override
    public boolean isPersonPresent(String name) {
        return people.stream()
                .anyMatch(person -> person.getName().equals(name));
    }

    @Override
    public void validateEmail(String email) {
        people.stream()
                .filter(person -> person.getEmail().equals(email))
                .findFirst()
                .ifPresent(p -> p.setVerified(true));
    }
}
