package com.javagda23.streamTraining;

import java.awt.print.Book;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Adam", "Nowak", 33, true),
                new Person("Marcin", "Pawłowski", 13, true)
//                new Person("Robert", "Małek", 23, true),
//                new Person("Anna", "Saska", 21, false),
//                new Person("Beata", "Wareńska", 22, false),
//                new Person("Maria", "Gdańska", 11, false),
//                new Person("Jacek", "Kowalski", 18, true),
//                new Person("Jacek", "Górski", 15, true),
//                new Person("Andżelika", "Dżoli", 25, false),
//                new Person("Wanda", "Ibanda", 12, false),
//                new Person("Marek", "Marecki", 17, true),
//                new Person("Johny", "Brawo", 25, true),
//                new Person("Stary", "Pan", 80, true),
//                new Person("Newbie", "Noob", 12, true),
//                new Person("Newbies", "Sister", 19, false)
        ));
        List<Person> list2 = new ArrayList<>(Arrays.asList(
                new Person("Adam", "Nowak", 33, true),
                new Person("Marcin", "Pawłowski", 13, true),
                new Person("Robert", "Małek", 23, true)
//                new Person("Anna", "Saska", 21, false),
//                new Person("Beata", "Wareńska", 22, false),
//                new Person("Maria", "Gdańska", 11, false),
//                new Person("Jacek", "Kowalski", 18, true),
//                new Person("Jacek", "Górski", 15, true),
//                new Person("Andżelika", "Dżoli", 25, false),
//                new Person("Wanda", "Ibanda", 12, false),
//                new Person("Marek", "Marecki", 17, true),
//                new Person("Johny", "Brawo", 25, true),
//                new Person("Stary", "Pan", 80, true),
//                new Person("Newbie", "Noob", 12, true),
//                new Person("Newbies", "Sister", 19, false)
        ));


        List<List<Person>> collectionOfListBooks = Arrays.asList(list, list2);
        Stream<List<Person>> streamOfListBooks = collectionOfListBooks.stream();

        long newList = streamOfListBooks
                .flatMap(Collection::stream)
                .map(person -> person.getFirstName())
                .distinct()
                .count();
        System.out.println(newList);












//        List<Person> maleList = list.stream()
//                .filter(l -> l.isMale())
//                .collect(Collectors.toList());
//        System.out.println(maleList);
//
//        List<Person> femaleList = list.stream()
//                .filter(l -> !l.isMale())
//                .filter(a -> a.getAge() > 18)
//                .collect(Collectors.toList());
//        System.out.println(femaleList);
//
//        Optional<Person> jackList = list.stream()
//                .filter(person -> person.getFirstName().equalsIgnoreCase("Jacek") && person.getAge() >= 18)
//                .findFirst();
//        System.out.println(jackList);
//
//        if(jackList.isPresent()){
//            Person jack = jackList.get();
//            System.out.println("1 " + jackList);
//            System.out.println("2 " + jack);
//        } else {
//            System.out.println("Not found!");
//        }
//
//        Set<String> personBetween1519 = list.stream()
//                .filter(person -> person.getAge() > 15 && person.getAge() <19)
//                .map(person -> person.getLastName())
//                .collect(Collectors.toSet());
//        System.out.println(personBetween1519);
//
//        OptionalDouble age = list.stream()
//                .mapToInt(person -> person.getAge())
//                .average();
//        System.out.println(personBetween1519);

    }
}
