package com.company;

public class Main {

    public static void main(String[] args) {
	    //setting up bank account
        BankAccount checking = new BankAccount();
        checking.setCustomerName("Yaw");
        checking.setBalance(1000);
        checking.setEmail("Yawoseiagyemang80@gmail.com");
        checking.setPhoneNumber("571-343-8210");
        checking.setAccountNumber(321);

        checking.withDrawFunds(500);
        checking.accountSummary();



    }
}
