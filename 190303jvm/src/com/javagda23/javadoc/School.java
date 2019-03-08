package com.javagda23.javadoc;

import java.util.List;
import java.util.Set;

/**
 * School interface that can be implements in other classes.
 */
public interface School {
    /**
     * Method to add a student by object of student.
     * @param student - student.
     */
    void addStudent(Student student);

    /**
     * Method to add a student by parameters given as an argument of the method.
     * @param firstName - student's first name.
     * @param lastName - student's last name.
     * @param age - student's age.
     * @param courses - types of courses.
     */
    void addStudent(String firstName, String lastName, int age, Set<Course> courses);

    /**
     * Method that returns sbudent by his name and last name.
     * @param firstName - student's first name.
     * @param lastName - student's last name.
     * @return
     */
    Student getStudentByFirstNameAndLastName(String firstName, String lastName);

    /**
     * Shows list of students group by type of course.
     * @param course - types of courses.
     * @return
     */
    List<Student> getStudentsByCourse(Course course);
}
