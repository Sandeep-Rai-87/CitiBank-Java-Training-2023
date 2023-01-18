package com.citibank.main;

import com.citibank.main.domain.MyClass;
// Types of exceptions
//1. Checked --> Compile time exception, which will not allow to compile if these exceptions are not handled 
//   IOException
//   SQLException
//2. Unchecked --> Run time exception 
//   InputMismatchedException 
public class MyClassMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		MyClass myClass = new MyClass();
		myClass.accept();
		myClass.calculate();
		myClass.display();
		System.out.println("Main End");

	}

}
