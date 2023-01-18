package com.citibank.main.domain;

//Specialization
public class Triangle extends Shapes {
	public Triangle() {
		System.out.println("Default Constructor Of Triangle");
	}
	
	public Triangle(int size) {
		System.out.println("Param Constructor Of Triangle");
		System.out.println("Size ::" + size);
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}
}
