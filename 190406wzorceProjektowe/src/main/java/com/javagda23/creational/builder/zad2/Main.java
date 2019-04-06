package com.javagda23.creational.builder.zad2;

public class Main {
    public static void main(String[] args) {
        final Person person = Person.personBuilder()
                .age(13)
                .name("Michal")
                .surname("Bocian")
                .create();
        System.out.println(person);
    }
}
