package com.javagda23.zad4;

public class Townsman extends Citizen {

    public Townsman(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
