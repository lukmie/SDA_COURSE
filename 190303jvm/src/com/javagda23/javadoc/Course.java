package com.javagda23.javadoc;

/**
 * This enum represents every type of Course.
 */
public enum Course {
    /**
     * This value represents backend developer course.
     */
    BACKEND_DEVELOPER("Backend Developer"),
    /**
     * This value represents frontend developer course.
     */
    FRONTEND_DEVELOPER("Frontend Developer"),
    /**
     * This value represents AI Engineer developer course.
     */
    AI_ENGINEER("AI Engineer"),
    /**
     * This value represents dev ops developer course.
     */
    DEV_OPS("Dev ops");

    private String courseName;

    /**
     * Course constructor, creates a course with description given in parameter.
     * @param courseName - course description/name.
     */
    Course(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Returns course description name.
     * @return - course name.
     */
    public String getCourseName() {
        return courseName;
    }
}
