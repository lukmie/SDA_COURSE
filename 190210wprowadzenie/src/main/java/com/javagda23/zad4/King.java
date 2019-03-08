package com.javagda23.zad4;

public class King extends Citizen {

    public King(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
