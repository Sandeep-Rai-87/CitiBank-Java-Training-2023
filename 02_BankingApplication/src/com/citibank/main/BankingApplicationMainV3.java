package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Account account = new Account(); //called the default account constructor 
		Account account;
//		Savings savings;
		
		int accountNumber;
		String name;
		double balance;
		char choice;
		double amount;
		String continueChoice;

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.next();
		scanner.nextLine();	
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		//accept do you want to open salary acount

//		account.setAccountNumber(accountNumber);
//		account.setName(name);
//		account.setBalance(balance);
		account = new Account(accountNumber,name,balance);  //Calling the parameterized constructor from Account
//		savings = new Savings(accountNumber, name, balance, false); //write all the params
		
		System.out.println("Your account is opened successfully");
		System.out.println("Account Number :: " + account.getAccountNumber());
		System.out.println("Name :: " + account.getName());
		System.out.println("Balance :: " + account.getBalance());

		System.out.println();
		do {

			showTransactionMenu(scanner, account);
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();

		} while (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("y"));
		System.out.println("Thank you!!");

	}

	private static void showTransactionMenu(Scanner scanner, Account account) {
		char choice;
		double amount;
		System.out.println("Transaction Menu");
		System.out.println("Press 1. For Withdraw");
		System.out.println("Press 2. For Deposit");
		System.out.println("Press 3. For Check Balance");
		System.out.println("Press 4. For Exit");
		System.out.println("Enter your choice");
		choice = scanner.next().charAt(0);

		switch (choice) {
		case '1':
			System.out.println("Enter amount to withdraw");
			amount = scanner.nextDouble();
			if (account.withdraw(amount))
				System.out.println("Withdraw Successfull !");
			else
				System.out.println("Withdraw Failed");
			break;

		case '2':
			System.out.println("Enter amount to deposit");
			amount = scanner.nextDouble();
			if (account.deposit(amount))
				System.out.println("Deposit Successfull !");
			else
				System.out.println("Deposit Failed");
			break;

		case '3':
			System.out.println("Balance :: " + account.getBalance());
			break;

		case '4':
			System.out.println("Thank you !!");
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

}
