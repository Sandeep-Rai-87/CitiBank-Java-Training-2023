package com.citibank.main.domain;

public class AccountThread implements Runnable{
	private Account account;
	private int transactionChoice;
	private double balance;	
	

	public AccountThread(Account account, int transactionChoice, double balance) {
		super();
		this.account = account;
		this.transactionChoice = transactionChoice;
		this.balance = balance;
	}


	@Override
	public void run() {
		if (transactionChoice == 1) {
			account.withdraw(balance);
		}
		if (transactionChoice == 2) {
			account.deposit(balance);
		}
		
	  		
	}
	
	

}
