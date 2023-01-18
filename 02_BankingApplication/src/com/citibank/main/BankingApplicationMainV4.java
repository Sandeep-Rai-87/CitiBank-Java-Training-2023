package com.citibank.main;

import java.util.Scanner;

public class BankingApplicationMainV4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Savings savings;
		
		int accountNumber;
		String name;
		double balance;
		boolean isSalary;
		String isSal;
		String continueChoice;
		
		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.next();
		scanner.nextLine();	
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		System.out.println("Do you want to open salary account ? True/False");
		isSal = scanner.next();
		
		if (isSal.equalsIgnoreCase("Yes") || isSal.equalsIgnoreCase("Y")) {
			isSalary = true;
					}
		else {
			isSalary = false;
		}
		savings = new Savings(accountNumber, name, balance, isSalary);
		
		System.out.println("Your account is opened successfully");
		System.out.println("Account Number :: " + savings.getAccountNumber());
		System.out.println("Name :: " + savings.getName());
		System.out.println("Balance :: " + savings.getBalance());
		System.out.println("Current Account :: " + savings.isSalary());
		
		System.out.println();
		do {
			showTransactionMenu(scanner, savings);
			System.out.println("Do you want to continue");
			continueChoice = scanner.next();
			} while (continueChoice.equals("Y")|| continueChoice.equals("y"));
		System.out.println("Thank you!!" + name);

	}
	private static void showTransactionMenu(Scanner scanner, Savings savings) {
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
			if (savings.withdraw(amount))
				System.out.println("Withdraw Successfull !");
			else
				System.out.println("Withdraw Failed");
			break;

		case '2':
			System.out.println("Enter amount to deposit");
			amount = scanner.nextDouble();
			if (savings.deposit(amount))
				System.out.println("Deposit Successfull !");
			else
				System.out.println("Deposit Failed");
			break;

		case '3':
			System.out.println("Balance :: " + savings.getBalance());
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
