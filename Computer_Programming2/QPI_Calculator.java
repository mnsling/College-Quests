import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class MProb2 {

private static final DecimalFormat df = new DecimalFormat("#.##");
  
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);          //variables
    int total;
    int nUnits;
    int grade;
    double qpi = 0;
    int units = 0;
    

    System.out.print("Total Units: ");            //prints out the Total Units
    total = in.nextInt();
    System.out.println();

    while (units < total) {                       //repeat the steps when units are less than the total units
    
      subject();                                  
      System.out.print("Units: ");
      nUnits = in.nextInt();                        //inputs the Unit of the Subject
      units += nUnits;                              //if the number of units is less than the total, we add the following number of units until it is equal to break the loop.

      if (units > total) {                          //if the added/nonadded version of the units is greater than the total, it will print out this statement. 
          System.out.println();
          System.out.println("Error, You have gone passed your total units.");
          System.out.println("Please Try Again.");
        break;
      }
      
      System.out.print("Percentage Grade: ");
      grade = in.nextInt();                         //inputs the % Grade of the Student
      
      if (grade >= 92 && grade <= 100) {
      double qpe = 4.0;
      double a = qpe * nUnits / total;              
      qpi += a;                                           //the variable qpi is now added by the computed qpi of subject a.

      
      System.out.println("Letter Grade: A");              //the assigned letter grade for this if statement
      System.out.println("QPE: " + qpe);                  //prints the QPE of the subject
      System.out.println(a);                              //the QPI for this specific subject
      System.out.println();
      }  
      else if (grade >= 88 && grade <= 91) {
      double qpe = 3.5;
      double b = qpe * nUnits / total;
      qpi += b;                                           //we add all of the qpi's together until we have reached to total units limit.

      System.out.println("Letter Grade: B+");             //the line of code that looks similar here have the same use.
      System.out.println("QPE: " + qpe);
      System.out.println(b);
      System.out.println();  
      }
      else if (grade >= 84 && grade <= 87) {
      double qpe = 3.0;
      double c = qpe * nUnits / total;
      qpi += c;
      
      System.out.println("Letter Grade: B");
      System.out.println("QPE: " + qpe);
      System.out.println(c);
      System.out.println();
      }
      else if (grade >= 80 && grade <= 83) {
      double qpe = 2.5; 
      double d = qpe * nUnits / total;  
      qpi += d;
      
      System.out.println("Letter Grade: C+");
      System.out.println("QPE: " + qpe);
      System.out.println(d);
      System.out.println();
      }
      else if (grade >= 76 && grade <= 79) {
      double qpe = 2.0;
      double e = qpe * nUnits / total;
      qpi += e;
      
      System.out.println("Letter Grade: C");
      System.out.println("QPE: " + qpe);
      System.out.println(e);
      System.out.println();
      }
      else if (grade >= 72 && grade <= 75) {
      double qpe = 4.0;
      double f = qpe * nUnits / total;
      qpi += f;
      
      System.out.println("Letter Grade: D");
      System.out.println("QPE: " + qpe);
      System.out.println(f);
      System.out.println();
      }
      else {
      double qpe = 0.0;
      double g = qpe * nUnits / total;
      qpi += g;
      System.out.println("Letter Grade: F");
      System.out.println("QPE: " + qpe);
      System.out.println(g);
      System.out.println();
      }
    }
    if (units > total) {                        //if the units are greater than the total, no need to show the total QPI of the subjects. 
      System.out.print("");
    } else {
      System.out.println("QPI: " + df.format(qpi));        //but, if the units are less than the total, we print the total QPI of the subjects.
    }   
}
  public static void subject() {                //method that prints out the Class of the Student
    Scanner in = new Scanner(System.in);
    String subject;

    System.out.print("Class: ");
    subject = in.nextLine();
  }
}
