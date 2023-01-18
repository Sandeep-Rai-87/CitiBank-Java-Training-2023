package com.citibank.main.domain;

public class Account {
	
	private double balance = 50000;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public synchronized void withdraw (double amount) {
		System.out.println("Withdraw Start ::" + balance);
		if (amount > balance) {
			System.out.println("Withdrawal amount is greater than balance");
		} else {
			balance = balance - amount;
			System.out.println("After Withdraw, balance ::" + balance);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Withdraw End ::" + balance);
	}
	
	public synchronized void deposit (double amount) {
		System.out.println("Deposit Start ::" + balance);
		balance = balance + amount;
		System.out.println("Balance aftet deposit ::" + balance);
		System.out.println("Deposit End ::" + balance);
	}
	
	

}
