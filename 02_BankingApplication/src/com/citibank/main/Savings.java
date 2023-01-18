package com.citibank.main;

import com.citibank.main.domain.Account;

public class Savings extends Account {
	private boolean isSalary;
	
	public Savings() {
		// TODO Auto-generated constructor stub
	}
	
	public Savings(int accountNumber, String name, double balance, boolean issalary) {
		super(accountNumber, name, balance);
		this.isSalary = issalary;	
				
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public boolean withdraw(double amount) {
		// Write business logic
		if (amount > 0 && amount <= getBalance()) {
			if (isSalary) {
				setBalance(getBalance() - amount);
				return true;
			}
			if (isSalary == false && getBalance() - amount >= 1500) {
				setBalance(getBalance() - amount);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean deposit(double amount) {
		// Write business logic
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}
	

}
