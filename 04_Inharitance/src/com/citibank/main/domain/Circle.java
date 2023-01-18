package com.citibank.main.domain;

//Specialization
public class Circle extends Shapes {
	public Circle() {
		System.out.println("Default Constructor Of Circle");
	}
	
	public Circle(int size) {
		super(size);
		System.out.println("Param Constructor Of Circle");
		System.out.println("Size ::" + size);
	}
		
//	@Override
//	public void draw() {
//		System.out.println("Drawing Circle");
//	}
}
