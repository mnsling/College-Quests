import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Main {
    private double balance;
    private static double annualInterestRate; 

    
    public Main(double initialBalance) {
        this.balance = initialBalance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + String.format("%.2f", amount) + " new balance is " + String.format("%.2f", balance));
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

   
    public void withdraw(double amount) {
        if (amount >= 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawed " + String.format("%.2f", amount) + " new balance is " + String.format("%.2f", balance));
            } else {
                System.out.println("Insufficient funds. Available balance is $" + String.format("%.2f", balance));
            }
        }
    }

    
    public void calculateMonthlyInterest() {
        double monthlyInterest = (balance * annualInterestRate) / 12;
        balance += monthlyInterest;
        System.out.println("New balance after interest rate is applied " + String.format("%.2f", balance));
    }

    
    public static void modifyInterestRate(double newInterestRate) {
        DecimalFormat df = new DecimalFormat("#.##");
        annualInterestRate = Double.parseDouble(df.format(newInterestRate));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String accNum = scanner.nextLine();
        String name = scanner.nextLine();
        String phone = scanner.nextLine();
        double initialBalance = scanner.nextDouble();

        Main account = new Main(initialBalance);

        double depositAmount = scanner.nextDouble();
        double newInterestRate = scanner.nextDouble();
        double withdrawalAmount = scanner.nextDouble();
        System.out.println();

       
        account.deposit(depositAmount);
        account.withdraw(withdrawalAmount);
        Main.modifyInterestRate(newInterestRate); 
        account.calculateMonthlyInterest();

        scanner.close();
    }
}
