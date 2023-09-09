import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws Exception{

    ArrayList<String> studentArray = new ArrayList<>(10); //max length of this arraylist is 10
    Scanner in = new Scanner(System.in);

    //variables
    String studAns;
    String name[] = new String[10];
    String ans[] = new String[10];
    int count = 0;
    int i = 0;

    System.out.println("Enter students name and answer.");
    System.out.println("Type 'Exit' to stop and close the program.");
    System.out.println();

    while(true) {
      studAns = in.nextLine();
      if(studAns.equalsIgnoreCase("Exit") || count == 9) { //the programs stops when we input 'Exit' or when we reach the limit of student count
        break;
      }
      studentArray.add(studAns); //add the name and answers in the studentarraylist
      count++; //increases the student count until we break the loop.
    }    
    for(i = 0; i < studentArray.size(); i++) {
      name[i] = studentArray.get(i).substring(0, studentArray.get(i).indexOf(' '));
      ans[i] = studentArray.get(i).substring(studentArray.get(i).indexOf(' ') + 1, studentArray.get(i).length());
    }
    gradeExam(count, name, ans);
  }

  public static void gradeExam(int count, String[] n, String[] a) { 

    char[] correct = {'F', 'F', 'T', 'F', 'T', 'F', 'T', 'T', 'T', 'F', 'F', 'F', 'T', 'F', 'T'}; //correct answers
    char[] temp; //temporary variable
    int average = 0; //variable for the average score
    int[] score = new int[count]; //scores array for each students

    for (int i = 0; i < a.length; i++) {
      if(a[i] != null) {
        temp = a[i].toCharArray();
        for(int y = 0; y < correct.length; y++) {
          if(temp[y] == correct[y]) {
            score[i] += 1;
          }
        }
      }
    }

    for (int i = 0; i < score.length; i++) {
            average += score[i];
    }

    average = average/count;

    for (int i = 0; i < score.length; i++) {
            if(score[i]> average){
            System.out.println(n[i] + " A");
            }
            else if (score[i] < average){
                System.out.println(n[i] + " C");
            }
            else{
                System.out.println(n[i] + " B");
            }
    }
  }
}
