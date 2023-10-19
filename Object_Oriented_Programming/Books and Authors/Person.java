package main;

public class Person {
    
    public String name;
    
    //constructor
    public Person(String name) {
        this.name = name;
    }
    
    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    
    //toString method
    @Override
    public String toString() {
        return name;
    }
}
