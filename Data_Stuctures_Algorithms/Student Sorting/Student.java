package main; // Declaring the package "main" for this Java class

public class Student { // Defining the Student class

    // Private instance variables to store student information
    private String lastname, firstname, studentid, course;
    private char gender;
    private int yearlevel;

    // Constructor to initialize a Student object with provided data
    public Student(String ln, String fn, String id, String cors, char g, int yl) {
        lastname = ln;       // Initialize the last name
        firstname = fn;      // Initialize the first name
        studentid = id;      // Initialize the student ID
        course = cors;       // Initialize the course
        gender = g;          // Initialize the gender
        yearlevel = yl;      // Initialize the year level
    }

    // Constructor (not implemented) with a different parameter list
    public Student(int studentId, String lastName, String firstName, char gender, String course, int yearLevel) {
        throw new UnsupportedOperationException("Not supported yet."); // Placeholder for an unsupported constructor
    }

    // Method to display student information
    public void display() {
        // Format and print student information
        System.out.printf("ID: %-8s  Name: %-20s  Sex: %c  Course: %-8s  Year: %d\n", studentid, (lastname + ", " + firstname), gender, course, yearlevel);
    }

    // Setter method for setting the gender
    public void setGender(char gender) {
        this.gender = gender;
    }

    // Getter method for getting the gender
    public char getGender() {
        return gender;
    }

    // Setter method for setting the last name
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Getter method for getting the last name
    public String getLastname() {
        return lastname;
    }

    // Setter method for setting the first name
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    // Getter method for getting the first name
    public String getFirstname() {
        return firstname;
    }

    // Setter method for setting the student ID
    public void setStudentId(String studentid) {
        this.studentid = studentid;
    }

    // Getter method for getting the student ID
    public String getStudentId() {
        return studentid;
    }

    // Setter method for setting the course
    public void setCourse(String course) {
        this.course = course;
    }

    // Getter method for getting the course
    public String getCourse() {
        return course;
    }

    // Setter method for setting the year level
    public void setYearLevel(int yearlevel) {
        this.yearlevel = yearlevel;
    }

    // Getter method for getting the year level
    public int getYearLevel() {
        return yearlevel;
    }

    // Placeholder method (not implemented) for getting the last name as an Object
    Object getLastName() {
        throw new UnsupportedOperationException("Not supported yet."); // Placeholder for an unsupported method
    }
}
