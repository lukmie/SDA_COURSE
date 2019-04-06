package com.javagda23.creational.builder;

import com.javagda23.creational.builder.zad1.Player;
import com.javagda23.creational.builder.zad2.Person;
import com.javagda23.creational.builder.zad3.Book;

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

        final Person person = new Person("s", "ss", 3);

//        final Person person2 = new Person.PersonBuilder().age(2).build();

        final Book book1 = new Book.BookBuilder()
                .withAuthor("Adam")
                .withDescription("Aasd dsa")
                .withISBN("2343ASD")
                .withPages(232)
                .withTitle("Zzxc sdf sdf")
                .build();

        System.out.println(book1.toString());
    }
}
