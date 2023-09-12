package main; // Declaring the package "main" for this Java class

import java.io.*; // Importing necessary Java input-output classes
import java.util.*; // Importing Java utility classes

public class Main { // Defining the main class

    public static void main(String[] args) throws IOException { // Main method, program entry point
        ArrayList<Student> students = new ArrayList<>(); // Creating an ArrayList to store Student objects

        // Provide the correct file path without double quotes
        String filePath = "C:\\Users\\Nicklaus Ling\\OneDrive\\Desktop\\Main\\src\\main\\students.txt"; // Storing the file path in a variable

        // Read data from the file using a try-with-resources block to automatically close the scanner
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNext()) { // Loop until there are more lines in the file
                String id = scanner.nextLine(); // Read the student's ID from the file
                String lastName = scanner.nextLine(); // Read the last name from the file
                String firstName = scanner.nextLine(); // Read the first name from the file
                char gender = scanner.nextLine().charAt(0); // Read the gender from the file
                String course = scanner.nextLine(); // Read the course from the file
                int yearLevel = Integer.parseInt(scanner.nextLine()); // Read the year level from the file and parse it as an integer

                // Create a Student object with the read data and add it to the ArrayList
                Student student = new Student(lastName, firstName, id, course, gender, yearLevel);
                students.add(student);
            }
        } catch (IOException e) { // Handle IOException if the file cannot be read
            e.printStackTrace(); // Print error details to the console
        }

        // Create an instance of the StudentComparator
        sortStudents comparator = new sortStudents();

        // Sort the students using the comparator
        Collections.sort(students, comparator);

        // Iterate through the sorted list and display the results
        for (Student student : students) {
            student.display(); // Display each student's information
        }
    }
}
