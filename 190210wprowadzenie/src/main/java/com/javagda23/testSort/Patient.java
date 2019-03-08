package com.javagda23.testSort;

import java.util.Objects;

public class Patient implements Comparable<Patient> {
    private String name;
    private String lastName;
    private Integer age;
    private Boolean isMale;
    public Patient(String name, String lastName, Integer age, Boolean isMale){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public Integer getAge() {
        return age;
    }
    public Boolean getMale() {
        return isMale;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(name, patient.name) &&
                Objects.equals(lastName, patient.lastName) &&
                Objects.equals(age, patient.age) &&
                Objects.equals(isMale, patient.isMale);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, isMale);
    }
    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }

    @Override
    public int compareTo(Patient o) {
        if(isMale) return 1;
        if(o.isMale) return -1;

        if(name.compareTo(o.name) == 0){
            return lastName.compareTo(o.lastName)*-1;
        }

        if (this.age == o.age) {
            return 0;
        } else {
            if (o.age <age) return 1;
            if (age < o.age) return -1;
        }
        return 0;

    }
}
