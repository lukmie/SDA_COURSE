package com.javagda23.zad4;

import java.util.*;

public class University implements StudentFormat {
    private Map<Long, Student> map = new HashMap<>();

    public void addStudent(Long numerIndeksu, String imie, String nazwisko) {
        map.put(numerIndeksu, new Student(numerIndeksu, imie, nazwisko));
    }

    public void addStudent(String imie, String nazwisko) {
        Long nowyIndeks;
        List<Long> list = new ArrayList<>(map.keySet());

        if (map.keySet().size() == 0) {
            nowyIndeks = 0L;
        } else {
            nowyIndeks = list.get(list.size() - 1) + 1;
        }

        map.put(nowyIndeks, new Student(nowyIndeks, imie, nazwisko));

    }

    public boolean containsStudent(Long numerIndeksu) {
        return map.containsKey(numerIndeksu);
    }

//    public Optional<Student> getStudent(Long numerIndeksu){
//        return Optional.ofNullable(map.get(numerIndeksu));
//    }

    public Student getStudent(Long numerIndeksu) {
        if (!containsStudent(numerIndeksu)) {
            throw new NoSuchStudentException("Brak studenta o podanym numerze indeksu");
        }
        return map.get(numerIndeksu);
    }

    public int studentsCount() {
        return map.size();
    }

    public void printAllStudents() {
        for (Student value : map.values()) {
            System.out.println(format(value));
        }
    }

    @Override
    public String format(Student student) {
        return student.toString();

    }
}
