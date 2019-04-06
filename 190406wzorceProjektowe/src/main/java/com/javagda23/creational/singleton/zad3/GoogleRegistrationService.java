package com.javagda23.creational.singleton.zad3;

public class GoogleRegistrationService implements RegistrationService {
    @Override
    public void register(String username, String email) {
        UserRepository.INSTANCE.addUser(username, email);
    }
}
