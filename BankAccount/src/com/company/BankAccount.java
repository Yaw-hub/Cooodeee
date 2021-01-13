package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double fund) {
        System.out.println("Adding funds......");
        this.balance += fund;
        double currentBalance = this.balance;
        System.out.println("You just added " + fund + " to your account");
        System.out.println("Current balance " + currentBalance);
    }

    public void withDrawFunds(double fund) {
        if (this.balance <= 0) {
            System.out.println("You have insufficient funds, please deposit funds");
        }else {
            System.out.println("Withdrawing funds......");
            this.balance -= fund;
            double currentBalance = this.balance;
            System.out.println("You just withdrew " + fund + " from your account");
            System.out.println("Current balance " + currentBalance);
        }

    }

    public void accountSummary() {
        System.out.println("------ Account Summary ------");
        System.out.println("Account name: " + this.getCustomerName());
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("Email \u2709: " + this.getEmail());
        System.out.println("Phone \u260E: " + this.getPhoneNumber());
        System.out.println("Balance: " + this.getBalance());
    }
}
