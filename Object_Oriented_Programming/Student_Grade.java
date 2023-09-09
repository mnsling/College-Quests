import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  private static ArrayList<Integer> list = new ArrayList<Integer>();
  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of students: ");
    int numStudents = scanner.nextInt();

    int studentCount = 0;
    while (studentCount < numStudents) {
      int studentNumber = studentCount + 1;
      System.out.print("Enter the grade for student " + studentNumber + ": ");
      int grade = scanner.nextInt();

      studentCount ++;
      list.add(grade);
    }

    System.out.println("")
  }
}
