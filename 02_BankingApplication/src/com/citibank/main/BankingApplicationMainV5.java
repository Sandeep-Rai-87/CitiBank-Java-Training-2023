package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.Current;

public class BankingApplicationMainV5 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner (System.in);
//		Current current;
		Current current = new Current(101, "Vivek Gohil", 10000, 50000);
//		current=new Current()
		
		if(current.withdraw(5000)) {
			System.out.println("Withdraw 5000");
			//5000
			System.out.println("Balance :: " + current.getBalance());
			//50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
		}
		
		if(current.withdraw(20000)) {
			System.out.println("Withdraw 20000");
			//0
			System.out.println("Balance :: " + current.getBalance());
			//35000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
		}
		
		if(current.deposit(10000)) {
			System.out.println("Deposited 10000");
			//0
			System.out.println("Balance :: " + current.getBalance());
			//45000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
	
		}
		
		if(current.deposit(15000)) {
			System.out.println("Deposited 15000");
			//10000
			System.out.println("Balance :: " + current.getBalance());
			//50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
	
		}
		
		if(current.deposit(5000)) {
			System.out.println("Deposited 5000");
			//10000
			System.out.println("Balance :: " + current.getBalance());
			//50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
	
		}
		if(current.withdraw(60000)) {
			System.out.println("Withdraw 60000");
			//10000
			System.out.println("Balance :: " + current.getBalance());
			//50000
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
	
		}
	}

}