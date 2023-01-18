package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		MyClass myClass = new MyClass();//Object method 1
		myClass.show();//Object method 1
		System.out.println("---------------");
		new MyClass().show();// Work same as Object method 1

		System.out.println("**************");
		new MyClass(10);
		
		System.out.println("$$$$$$$$$$$$$$");
		new MyClass(10,20);
		
		System.out.println("###############");
		new MyClass("Test");
		
		System.out.println("Main End");
	}

}
