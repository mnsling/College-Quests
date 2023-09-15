package main;

public class Student {
    
    //private data types
    private String student_name;
    private double grades;
    
    //constructors
    public Student() {
        this.student_name = student_name;
        this.grades = grades;
    }
    
    //getters setters

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }
    
    //toString method

    @Override
    public String toString() {
        return student_name + "\t" + grades;
    }
    
}
