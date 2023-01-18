package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
	private double num1;
	private double num2;
	private double result;
	Scanner scanner = new Scanner(System.in);
	
	public void accept() {
		try {
			// accept two number from user
			System.out.println("Enter Number 1");
			num1 = scanner.nextDouble();
			System.out.println("Enter Number 2");
			num2 = scanner.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Invalid input provided");
			System.out.println("Program will continue its execution");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception in code");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank You !!");
			scanner.close();
		}
	}
	
	public void calculate () {
		System.out.println("Calculating two number");
		result = num1 / num2;
	}
	
	public void display() {
		//print value of result
		System.out.println("Result ::" + result);
	}

}
