package com.citibank.main.domain;

//Generalization 
public abstract class Shapes {
	// abstract class : It cannot be instantiated. We cannot create object of abstract class
	// abstract method : 
	//         		1. If we are creating abstract method, have to be in an abstract class always  
	//				2. Abstract method does not have body, it should contain only declaration 
	public Shapes() {
		System.out.println("Default Constructor Of Shapes");
	}
	
	public Shapes(int size) {
		System.out.println("Param Constructor Of Shapes");
		System.out.println("Size ::" + size);
		
	}
	
	public abstract void draw();
}
