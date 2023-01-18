package com.citibank.main;

import com.citibank.main.domain.Account;

public class Current extends Account {
	private double overdraftLimit;
	private double initialOverdraftBalance;
		
	public Current() {
		// TODO Auto-generated constructor stub
	}

	public Current(int accountNumber, String name, double balance, double overdraftLimit) {
		super(accountNumber, name, balance);
		this.overdraftLimit = overdraftLimit;
		initialOverdraftBalance = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public boolean withdraw(double amount) {
		//Write logic
		if (amount > 0 && amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return true;
		}
		if (amount > 0 && getBalance() > 0 && amount >= getBalance()) {
//			setBalance(getBalance() - amount);
//			overdraftLimit = overdraftLimit + getBalance();
			amount = amount - getBalance();
			setBalance(0);
			overdraftLimit = overdraftLimit - amount;
			return true;
		}
		
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0 ) {
			if (initialOverdraftBalance > overdraftLimit) {
				if (amount < initialOverdraftBalance - overdraftLimit) {
					overdraftLimit = overdraftLimit + amount;
					return true;
				}
				else {
					amount = amount - (initialOverdraftBalance - overdraftLimit);
					overdraftLimit = initialOverdraftBalance;
					setBalance(getBalance()+ amount);
					return true;
				}
			}
			else {
				setBalance(getBalance() + amount);
				return true;
			}
			
		}
		
		return false;
	}
		
	
	
}
