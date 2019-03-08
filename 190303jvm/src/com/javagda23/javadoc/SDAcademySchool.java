package com.javagda23.javadoc;

import java.util.List;
import java.util.Set;

/**
 * SDAcademySchool implements School class and override it's methods.
 */
public class SDAcademySchool implements School {
    /**
     * Overrided method from School class.
     * @param student - student.
     */
    @Override
    public void addStudent(Student student) {}

    /**
     * Overrided method from School class.
     * @param firstName - student's first name.
     * @param lastName - student's last name.
     * @param age - student's age.
     * @param courses - types of courses.
     */
    @Override
    public void addStudent(String firstName, String lastName, int age, Set<Course> courses) {}

    /**
     * Overrided method from School class.
     * @param firstName - student's first name.
     * @param lastName - student's last name.
     * @return
     */
    @Override
    public Student getStudentByFirstNameAndLastName(String firstName, String lastName) {
        return null;
    }

    /**
     * Overrided method from School class.
     * @param course - types of courses.
     * @return
     */
    @Override
    public List<Student> getStudentsByCourse(Course course) {
        return null;
    }
}
