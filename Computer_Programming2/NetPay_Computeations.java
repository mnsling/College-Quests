import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MProb1 {
 
    private static final DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double salary;
        
      
        int employees;
        int n = 1;

        System.out.print("No. of Employees: ");         //asks for the total number of employees
        employees = in.nextInt();             

         while (n <= employees) {                       //repeats the steps when n is less than the number of employees
            int nEmployee = n;                          //nEmployee is the same value as n
           
            if (nEmployee <= employees) {               //repeats until the condition is met
            System.out.println();
            System.out.println("Employee " + n);        //to see how many employees we have listed 
            }
        
        System.out.print("Gross Basic Pay: ");          //asks for the Gross Basic Pay        
        salary = in.nextDouble();
        System.out.println();
        System.out.println("Withholding Tax Basis");

           //Withholding Tax Computation

           double wTax = 0.00;
           double nph = 0.00;                           //variables
           double npi = 50;

           if (salary <= 10417) {
             double x = salary * 0.00;
             double y = salary * 0.02;
             wTax += x;                                 //if the condition is met, the x variable will be stored in the wTax variable where we can use for later computations.
             nph += y;                                  //same
             
             System.out.println("Over: None");
             System.out.println("Rate: None");
             System.out.println("Base: None");
             System.out.println();
             System.out.println("Total Witholding Tax: " + df.format(x));
           }
           else if (salary >= 10418 && salary <= 16666) {
             double x = salary - 10417;
             double y = x * 0.15;
             double z = y + 0.00;
             double v = salary * 0.02;
             wTax += z;
             nph += v;
             
             System.out.println("Over: P10,417");
             System.out.println("Rate: 15%");
             System.out.println("Base: P0.00");
             System.out.println();
             System.out.println("Total Witholding Tax: " + df.format(z));
           }
           else if (salary >= 16667 && salary <= 33332) {
             double x = salary - 16667;
             double y = x * 0.2;
             double z = y + 937.50;
             double v = salary * 0.02;
             wTax += z;
             nph += v;
             
             System.out.println("Over: P16,667");
             System.out.println("Rate: 20%");
             System.out.println("Base: P937.50");
             System.out.println();
             System.out.println("Total Witholding Tax: " + df.format(z));
           }
           else if (salary >= 33333 && salary <= 83332) {
             double x = salary - 33333;
             double y = x * 0.25;
             double z = y + 4270.70;
             double v = salary * 0.02;
             wTax += z;
             nph += v;
             
             System.out.println("Over: P33,333");
             System.out.println("Rate: 25%");
             System.out.println("Base: P4,270.70");
             System.out.println();
             System.out.println("Total Witholding Tax: " + df.format(z));
           }
           else if (salary >= 83333 && salary <= 333332) {
             double x = salary - 83333;
             double y = x * 0.3;
             double z = y + 16770.70;
             double v = salary * 0.02;
             wTax += z;
             nph += v;
             
             System.out.println("Over: P83,333");
             System.out.println("Rate: 30%");
             System.out.println("Base: P16,770.70");
             System.out.println();
             System.out.println("Total Witholding Tax: " + df.format(z));
           }
           else {
             double x = salary - 333333;
             double y = x * 0.35;
             double z = y + 91770.70;
             double v = salary * 0.02;
             wTax += z;
             nph += v;
             
             System.out.println("Over: P333,333");
             System.out.println("Rate: 35%");
             System.out.println("Base: P91,770.70");
             System.out.println();
             System.out.println("Total Witholding Tax: " + df.format(z));
           }
            double ph = salary * 0.02;
            double pi = 50.00;

            System.out.print("Philhealth: ");
            System.out.println(ph);
            System.out.print("Pag-Ibig: ");
            System.out.println(pi);
            System.out.print("SSS: ");

           //computing for the SSS

           double sss = 0;                          

           if (salary <= 4249.99) {
             double i = 180.00 / 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 4250.00 && salary <= 4749.99) {         //similar code with the withholding tax computation 
             double i = 202.50 / 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 4750.00 && salary <= 5249.99) {
             double i = 225.00 / 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 5250.00 && salary <= 5749.99) {
             double i = 247.50 / 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 5750.00 && salary <= 6249.99) {
             double i =  270.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 6250.00 && salary <= 6749.99) {
             double i =  292.50/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 6750.00 && salary <= 7249.99) {
             double i =  315.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 7250.00 && salary <= 7749.99) {
             double i =  337.50/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 7750.00 && salary <= 8249.99) {
             double i =  360.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 8250.00 && salary <= 8749.99) {
             double i =  382.50/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 8750.00 && salary <= 9249.99) {
             double i =  405.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 9250.00 && salary <= 9749.99) {
             double i =  427.50/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 9750.00 && salary <= 10249.99) {
             double i =  450.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 10250.00 && salary <= 10749.99) {
             double i =  472.50/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 10750.00 && salary <= 11249.99) {
             double i =  495.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 11250.00 && salary <= 11749.99) {
             double i =  517.50/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 11750.00 && salary <= 12249.99) {
             double i =  540.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 12250.00 && salary <= 12749.99) {
             double i =  562.50/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 12750.00 && salary <= 13249.99) {
             double i =  585.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 13250.00 && salary <= 13749.99) {
             double i =  607.50/ 2;
             sss += i;
             
             System.out.println(df.format(df.format(i)));
           }
           else if (salary >= 13750.00 && salary <= 14249.99) {
             double i =  630.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 14250.00 && salary <= 14749.99) {
             double i =  652.50/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 14750.00 && salary <= 15249.99) {
             double i =  675.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 15250.00 && salary <= 15749.99) {
             double i =  697.50/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 15750.00 && salary <= 16249.99) {
             double i =  720.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 16250.00 && salary <= 16749.99) {
             double i =  742.50/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 16750.00 && salary <= 17249.99) {
             double i =  765.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 17250.00 && salary <= 17749.99) {
             double i =  787.50/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 17750.00 && salary <= 18249.99) {
             double i =  810.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 18250.00 && salary <= 18749.99) {
             double i =  832.50/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 18750.00 && salary <= 19249.99) {
             double i =  855.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else if (salary >= 19250.00 && salary <= 19749.99) {
             double i =  877.50/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }
           else {
             double i =  900.00/ 2;
             sss += i;
             
             System.out.println(df.format(i));
           }

           double total = wTax + nph + npi + sss;       //computing for the total deduction

            System.out.print("Total Deductions: ");
            System.out.println(total);
            System.out.println();
            System.out.print("Total Net Pay: ");
            System.out.println(salary - total);         //computing for the total net pay
            
            System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");     //divider
            if (n == employees) {
              break;                                    //breaks the loop when condition is finally met
            }
           n++;
        }
    }
}
