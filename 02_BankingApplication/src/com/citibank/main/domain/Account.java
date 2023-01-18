package com.citibank.main.domain;

public abstract class Account {
	
	private int accountNumber;
	private String name;
	private double balance;
	
	public Account() {
		System.out.println("Default Constructor of Account");
	}

	public Account(int accountNumber, String name, double balance) {
		System.out.println("3 Parameterized constructor of Account");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}


//	public void setAccountNumber(int accountNumber) {
//		this.accountNumber = accountNumber;
//	}
//	
//	public int getAccountNumber() {
//		return accountNumber;
//	}
	public abstract boolean withdraw (double amount);	
//	public boolean withdraw (double amount) {
//		System.out.println("withdraw() called");
//		if (balance > amount && amount <= balance) {
//			balance = balance - amount;
//			return true;
//		}
//		return false;
//	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract boolean deposit(double amount);
		
	}
//	public boolean deposit(double amount) {
//		System.out.println("deposit called");
//		if (amount > 0) {
//			balance = balance + amount;
//			return true;
//		}
//		return false;
//	}
	
	

