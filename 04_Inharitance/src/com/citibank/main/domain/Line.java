package com.citibank.main.domain;

//Specialization
public class Line extends Shapes {
	public Line() {
		System.out.println("Default Constructor Of Line");
	}
	
	public Line(int size) {
		System.out.println("Param Constructor Of Line");
		System.out.println("Size ::" + size);
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Line");
	}
}
