package main;

public class SavingsAccount {
    
    //private data fields
    private String accountNumber = "";
    private String name = "";
    private String phoneNumber = "";
    private double initialBalance = 0.0;
    private double deposit = 0.0;
    private double annualInterest = 0.0;
    private double withdraw = 0.0;
    private double updatedBal = 0.0;
    
    //constructors
    public SavingsAccount() {
        this.accountNumber = accountNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.initialBalance = initialBalance;
        this.deposit = deposit;
        this.annualInterest = annualInterest;
        this.withdraw = withdraw;
        this.updatedBal = updatedBal;
    }
    
    //getters and setters method
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }
    
    public double getUpdatedBal() {
        return updatedBal;
    }

    public void setUpdatedBal(double updatedBal) {
        this.updatedBal = updatedBal;
    }
    
    //custom method
    public double deposit(double depositAmount) {
        updatedBal = initialBalance + deposit;
        return updatedBal;
    }
    
    public double withdraw(double withdrawAmount) {
        if(withdraw < updatedBal) {
            updatedBal = updatedBal - withdraw;
        } 
        return updatedBal;
    }
    
    public double failedWithdraw(double fail) {
        if(withdraw > updatedBal) {
            System.out.println("Insufficient Funds");
        }
        return updatedBal;
    }
    
    public double calculateAnnualInterest(double rate) {
        updatedBal = updatedBal * (1+ (annualInterest/12));
        return updatedBal;
    }
}
