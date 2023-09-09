import java.util.ArrayList;
import java.util.Scanner;

public class UseTaxpayer {

    public static void main(String[] args) throws Exception {
        
        ArrayList<Integer> listSsn = new ArrayList<Integer>();
        ArrayList<Integer> listYgi = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int ssn = 0;
        int ygi = 0;

        for(int i = 0; i < 10; i++) {
            System.out.println("Enter your Social Security Number: ");
            ssn = in.nextInt();
            listSsn.add(ssn);
            System.out.println("Enter your Yearly Gross income: ");
            ygi =  in.nextInt();
            listYgi.add(ygi);
            System.out.println();
        }
        
        for(int i = 0; i < 5; i++);
            System.out.println("Social Security Number       Yearly Gross Income");
            System.out.println(listSsn.get(0) + "                          " + listYgi.get(0));
            System.out.println(listSsn.get(1) + "                          " + listYgi.get(1));
            System.out.println(listSsn.get(2) + "                          " + listYgi.get(2));
            System.out.println(listSsn.get(3) + "                          " + listYgi.get(3));
            System.out.println(listSsn.get(4) + "                          " + listYgi.get(4));
    }
}
