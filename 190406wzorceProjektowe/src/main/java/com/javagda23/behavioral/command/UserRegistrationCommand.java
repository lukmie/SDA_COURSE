package com.javagda23.behavioral.command;

public class UserRegistrationCommand implements CommandBase {
    private UserData userData;
    private UserRepository userRepository;

    public UserRegistrationCommand(UserData userData, UserRepository userRepository) {
        this.userData = userData;
        this.userRepository = userRepository;
    }

    @Override
    public void execute() {
        userRepository.addUser(userData);
    }

    @Override
    public void undo() {
        userRepository.removeUser(userData);
    }
}
