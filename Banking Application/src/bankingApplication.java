import java.util.Scanner;

public class bankingApplication {
	public static void main(String [] args) {
		//TODO auto-generated method stub
		bankAccount obj1 = new bankAccount("Yaw", "0001");
		obj1.showMenu();
	}

}

class bankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	bankAccount(String cname, String cid) {
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount) {
		if(amount > 0) {
			balance += amount;
			previousTransaction = amount;
		}
	}
	
	void withDraw(int amount) {
		if(amount > 0) {
			balance -= amount;
			previousTransaction -= amount;
		}else {
			System.out.println("You have insufficient funds balance: " + balance);
		}
	}
	
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		}else if(previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		}else {
			System.out.println("No transaction occurred.");
		}
	}
	
	void showMenu() {
		char option = '\0';
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your Customer ID is: " + customerId);
		System.out.println("\n");
		System.out.println("Select A: to Check Balance");
		System.out.println("Select B: to Deposit");
		System.out.println("Select C: to WithDraw");
		System.out.println("Select D: for Previous Transaction");
		System.out.println("Select E: to Exit");
		
		do {
			System.out.println("==================================================================");
			System.out.println("Enter an option");
			System.out.println("==================================================================");
			option = input.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case 'A':
				System.out.println("----------------------------");
				System.out.println("Balance: " + balance);
				System.out.println("-----------------------------");
				System.out.println("\n");
				break;
			
			case 'B':
				System.out.println("----------------------------");
				System.out.println("Enter amount to Deposit: ");
				System.out.println("-----------------------------");
				System.out.println("\n");
				int amount = input.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("----------------------------");
				System.out.println("Enter amount to withdraw: ");
				System.out.println("-----------------------------");
				System.out.println("\n");
				int amount2 = input.nextInt();
				withDraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("----------------------------");
				getPreviousTransaction();
				System.out.println("-----------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("*********************************************");
				break;
				
			default:
				System.out.println("Invalid Option!! Please enter again");
				break;
			
					}
			}	
		while(option != 'E'); 
				System.out.println("Thank you for using our services!");
		
	}
}