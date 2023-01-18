package com.citibank.main.domain;
//
//Static functions
// 1. Static function can access/use only static variables
// 2. You can call static function without object
public class MyClass {
	
	public MyClass() {
		System.out.println("Default constructor of MyClass");
	}
	
	static {
		System.out.println("Static block of MyClass");
	}
	
	{
		System.out.println("Non Static block of MyClass");
	}
	
	public int num1 = 10;
	public static int num2 = 10;
	final int num3 = 50;
	
	public void display() {
		System.out.println("Number 1 ::" + num1);
		System.out.println("Number 2 ::" + num2);
		System.out.println("Number 3 ::" + num3);
		num1 = num1 + 10;
		num2 = num2 + 10;
//		num3 = num3 + 10; //will not allow to change the final variable value
		System.out.println("Number 1 ::" + num1);
		System.out.println("Number 2 ::" + num2);
		System.out.println("Number 3 ::" + num3);
		
	}
}
