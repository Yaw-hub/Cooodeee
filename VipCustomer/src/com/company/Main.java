package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer bob = new VipCustomer("Bob", "Bob123@gmail.com", 2000d);

        System.out.println(bob.getCreditLimit() + " " + bob.getEmailAddress() + " " + bob.getName() );
    }
}
