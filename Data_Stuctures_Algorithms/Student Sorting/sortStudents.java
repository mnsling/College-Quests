package main; // Declaring the package "main" for this Java class

import java.util.Comparator; // Importing the Comparator interface from the Java utility package

public class sortStudents implements Comparator<Student> { // Defining the "sortStudents" class that implements the Comparator interface for Student objects

    @Override
    public int compare(Student student1, Student student2) { // Implementing the compare method required by the Comparator interface
        // Compare students based on their last name, first name, and course in that order

        // Compare the last names of student1 and student2 and store the result
        int lastNameComparison = student1.getLastname().compareTo(student2.getLastname());
        if (lastNameComparison != 0) { // If last names are not equal, return the comparison result
            return lastNameComparison;
        }

        // Compare the first names of student1 and student2 and store the result
        int firstNameComparison = student1.getFirstname().compareTo(student2.getFirstname());
        if (firstNameComparison != 0) { // If first names are not equal, return the comparison result
            return firstNameComparison;
        }

        // If last names and first names are equal, compare the courses and return the result
        return student1.getCourse().compareTo(student2.getCourse());
    }
}
