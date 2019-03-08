package com.javagda23.javadoc;

import java.util.Set;

/**
 * This class represents Student's parameters.
 */
public class Student {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Set<Course> courses;

    /**
     * Student constructor, creates a Student with description given in parameter.
     * @param firstName - first name.
     * @param lastName - last name.
     * @param age - studen's age.
     * @param courses - kind of course.
     */
    public Student(String firstName, String lastName, int age, Set<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.courses = courses;
    }

    /**
     * Returns student's first name.
     * @return - firs name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns student's last name.
     * @return - last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns student's age.
     * @return - age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns type of course.
     * @return - courses.
     */
    public Set<Course> getCourses() {
        return courses;
    }
}
