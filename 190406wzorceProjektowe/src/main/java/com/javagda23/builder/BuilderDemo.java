package com.javagda23.builder;

import com.javagda23.builder.zad1.Player;

import java.util.Collections;

public class BuilderDemo {
    public static void main(String[] args) {
        final Player player = new Player.Builder()
                .withLevel(15L)
                .withHealth(50)
                .withMana(30)
                .withNick("Killer")
                .withFriends(Collections.<String>emptyList())
                .build();//stworzenie klasy bilder dla klasy typu player
    }
}
