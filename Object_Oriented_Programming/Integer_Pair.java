import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  private static ArrayList<Integer> list = new ArrayList<Integer>();
  public static void main(String[] args) throws Exception {

    Scanner input = new Scanner(System.in);
    int num = 0;

    System.out.println("Enter your sequence of Numbers. Type 0 if your done with your sequence.");

    while(true) {
      num = input.nextInt();
      if(num == 0)
        break;
      list.add(num);
    }

    System.out.println();
    System.out.println("These are the numbers left in your sequence.");

    if(list.size() % 2 != 0)
      list.remove(list.size()-1);

    for(int i = 0; i < list.size(); i+=2) {
      if(list.get(i) > list.get(i+1)) {
        list.remove(i);
        list.remove(i);
        i-=2;
      }
    }

    for(int i = 0; i < list.size(); i++)
      System.out.println(list.get(i));

    input.close();
  }
}
