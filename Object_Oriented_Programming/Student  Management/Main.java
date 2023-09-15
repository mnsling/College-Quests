package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        ArrayList<Student> x = new ArrayList<>();

        String menuItems = "y";
        boolean selection = true;

        while(selection) {
            System.out.println("-----------------------------------------------");
            System.out.println("A: Add students");
            System.out.println("V: View student");
            System.out.println("E: Edit student");
            System.out.println("R: Remove student");
            System.out.println("C: Compute the class average and clear the class list");
            System.out.println("Q: Quit");
            System.out.print("Enter choice: ");
            menuItems = input.nextLine();
            System.out.println("-----------------------------------------------");

            switch(menuItems.toUpperCase()) {
                case "A" :  addStudents(x);
                            break;
                case "V" :  viewStudents(x);
                            break;
                case "E" :  editStudents(x);
                            break;
                case "R" :  removeStudents(x);
                            break;
                case "C" :  computeAverage(x);
                            break;
                case "Q" :  selection = false;
                            break;

            }
        }

    }
    
    //You code starts here

    private static void addStudents(ArrayList<Student> x) {
        Student s = new Student();
        
        System.out.print("Name: ");
        s.setStudent_name(input.nextLine());
        System.out.print("Grade: ");
        s.setGrades(input.nextDouble());
        
        x.add(s);
        System.out.println("Student printed out successfully.");
        System.out.println(x);
    }

    private static void viewStudents(ArrayList<Student> x) {
        if(x.isEmpty()) {
            System.out.println("No Students");
        } else System.out.println("NAME" + "\t" + "GRADES"); {
            for(Student student : x) {
                System.out.println(student.toString());
            }
        }
    }

    private static void editStudents(ArrayList<Student> x) {
        if (x.isEmpty()) {
            System.out.println("No Students");
            System.out.println();
        } else {
        // Display the current cart items with indices for selection
        System.out.println("Current Students:");
            for (int index = 0; index < x.size(); index++) {
            System.out.println(index + ": " + x.get(index).toString());
            }

            // Prompt the user to select an item to edit
            System.out.print("Enter the index of the item you want to edit: ");
            int studentIndex = input.nextInt();

            // Check if the entered index is valid
            if (studentIndex >= 0 && studentIndex < x.size()) {
            Student studentToEdit = x.get(studentIndex);

            // Prompt the user for the editing options
            System.out.println("Edit Options:");
            System.out.println("1. Edit Name");
            System.out.println("2. Edit Grade");
            System.out.print("Enter the option you want to edit: ");
            int editOption = input.nextInt();
            System.out.println();

            if (editOption == 1) {
            System.out.print("Enter the new Student Name: ");
            input.nextLine();
            String newName = input.nextLine();
            studentToEdit.setStudent_name(newName);
            } else if (editOption == 2) {
            System.out.print("Enter the new Grade: ");
            double newGrade = input.nextDouble();
            studentToEdit.setGrades(newGrade);
            } else {
            System.out.println("Invalid edit option");
            }

            System.out.println("Student edited successfully:");
            System.out.println(studentToEdit.toString());
            } else {
            System.out.println("Invalid item index");
            }
        }
    }

    private static void removeStudents(ArrayList<Student> x) {
        if (x.isEmpty()) {
            System.out.println("Cart is empty");
        } else {
        // Display the current cart items with indices for selection
        System.out.println("Current Cart Items:");
            for (int index = 0; index < x.size(); index++) {
                System.out.println(index + ": " + x.get(index).toString());
            }
            System.out.println();

            // Prompt the user to select an item to delete
            System.out.print("Enter the index of the item you want to delete: ");
            int inDel = input.nextInt();

            // Check if the entered index is valid
            if (inDel >= 0 && inDel < x.size()) {
            Student deletedStudent = x.remove(inDel); // Remove the item from the list
            System.out.println("Student deleted successfully:");
            System.out.println(deletedStudent.toString());
            System.out.println();
            } else {
            System.out.println("Invalid Student index");
            System.out.println();
                    }
                }
    }

    private static void computeAverage(ArrayList<Student> x) {
        double total = 0;
        double average = 0;
    
        if (x.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            for (Student student : x) {
                total += student.getGrades(); // Add each student's grades to the total
            }
            
        average = total / x.size(); // Calculate the average by dividing the total by the number of students
        System.out.println("Class Average: " + average);
        x.clear(); // Clear the class list after computing the average.
    }
    }
}
