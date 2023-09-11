package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        
        SavingsAccount s = new SavingsAccount();
        Scanner in = new Scanner(System.in);
        
        //input your details            
        System.out.print("Account Number: ");
        s.setAccountNumber(in.nextLine());
        
        System.out.print("Name: ");
        s.setName(in.nextLine());
        
        System.out.print("Phone Number: ");
        s.setPhoneNumber(in.nextLine());
        
        System.out.print("Initial balance: ");
        s.setInitialBalance(in.nextDouble());
        
        System.out.print("Deposit Amount: ");
        s.setDeposit(in.nextDouble());
        
        System.out.print("Annual Interest Rate: ");
        s.setAnnualInterest(in.nextDouble());
        
        System.out.print("Withdraw Amount: ");
        s.setWithdraw(in.nextDouble());
        
        System.out.println();
        
        //call your methods
        
        //Deposited 1000.00 new balance is 2000.00
        System.out.println("Deposited " + String.format("%.2f", s.getDeposit()) + " new balance is " + String.format("%.2f", s.deposit(s.getUpdatedBal())));
        
        //Withdrawed 0.00 new balance is 2000.00
        if(s.getWithdraw() > s.getUpdatedBal()) {
            System.out.println("Insufficient Funds, try withdrawing a lesser amount.");
        } else {
            System.out.println("Withdrawed " + String.format("%.2f", s.getWithdraw()) + " new balance is " + String.format("%.2f", s.withdraw(s.getUpdatedBal())));
            //New balance after interest rate is applied 2006.67
            System.out.println("New balance after interest rate is applied " + String.format("%.2f", s.calculateAnnualInterest(s.getUpdatedBal())));
        }
    }  
}
