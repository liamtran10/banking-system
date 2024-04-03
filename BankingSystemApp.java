import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class BankingSystemApp {
    private Bank bank;

    public BankingSystemApp() {
        this.bank =  new Bank();
    }
	public static void main(String[] args) {
		new BankingSystemApp().use();
	}

	private int readChoice() {
		System.out.println("Welcome to the Todo List Application!"
			+ "\n" + "1. Create an account"
			+ "\n" + "2. Deposit funds"
			+ "\n" + "3. Withdraw funds"
			+ "\n" + "4. Check balance"
			+ "\n" + "5. Exit");
		System.out.println();
		System.out.print("Please enter your choice: ");
		return In.nextInt();
	}

	public void use() {
        int choice;
        while ((choice = readChoice()) != 5){
            switch (choice){
				case 1: bank.createAccount(); break;
				case 2: bank.deposit(); break;
				case 3: bank.withdraw(); break;
                case 4: bank.checkBalance(); break;
                default: help(); break;
            }
        }
        System.out.println("Thank you for using the Simple Banking System. Goodbye!");
    }

	private void help(){
		System.out.println("Please enter a number between 1 and 5.");
	}

}