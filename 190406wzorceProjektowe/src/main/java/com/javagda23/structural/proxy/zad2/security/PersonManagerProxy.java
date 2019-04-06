package com.javagda23.structural.proxy.zad2.security;

import java.util.Collections;
import java.util.List;

public class PersonManagerProxy implements PersonManager {
    private Person person;
    private PersonManager personManager;

    public PersonManagerProxy(Person person) {
        this.person = person;
        this.personManager = new PersonManagerImpl();
    }

    public boolean hasManagingPersonAccessType(AccessType accessType){
        return this.person.getRole().getAccessType().contains(accessType);
    }

    private boolean hasWriteAccessType(){
        return hasManagingPersonAccessType(AccessType.WRITE);
    }

    private boolean hasReadAccessType(){
        return hasManagingPersonAccessType(AccessType.READ);
    }

    @Override
    public void addPerson(Person person) {
        if (hasWriteAccessType()){ //idea proxy polega na tym, ze w tym miejscu dajemy ifa
            personManager.addPerson(person);
        }
    }

    @Override
    public void deletePerson(String emaial) {
        if (hasWriteAccessType()){
            personManager.deletePerson(emaial);
        }
    }

    @Override
    public List<Person> getAllPeople() {
        if (hasReadAccessType()){
            return personManager.getAllPeople();
        }
        return Collections.emptyList();
    }

    @Override
    public boolean isPersonPresent(String name) {
        if (hasReadAccessType()){
            return personManager.isPersonPresent(name);
        }
        return false;
    }

    @Override
    public void validateEmail(String email) {
        if (hasWriteAccessType()){
            personManager.validateEmail(email);
        }
    }
}
