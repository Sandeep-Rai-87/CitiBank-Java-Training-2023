package com.citibank.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.citibank.main.domain.Customer;

public class CustomerMainV3 {

	public static void main(String[] args) {
		Set<Customer> customerSet = new HashSet<>();
		
		Customer customer1 = new Customer(101, "Vivek Gohil", "Mumbai");
		Customer customer2 = new Customer(102, "Kapil Rawat", "Wagholi");
		Customer customer3 = new Customer(103, "Uday Nimje", "Chinchwad");
		Customer customer4 = new Customer(104, "Sandeep Rai", "Nigdi");
		Customer customer5 = new Customer(105, "Sameer Saxena", "Mumbai");
		Customer customer6 = new Customer(105, "Sameer Saxena", "Bombay");
		
		System.out.println("First Customer ::" + customer1.hashCode());
		System.out.println("Adding First Customer ::"
							+ customerSet.add(customer1));
//		System.out.println("Adding Second Customer ::"
//							+ customerSet.add(customer2));
//		System.out.println("Adding Third Customer ::"
//							+ customerSet.add(customer3));
//		System.out.println("Adding Fourth Customer ::"
//							+ customerSet.add(customer4));
		System.out.println("Fifth Customer ::" + customer5.hashCode());
		System.out.println("Adding Fifth Customer ::"
							+ customerSet.add(customer5));
		System.out.println("Sixth Customer ::" + customer6.hashCode());
		System.out.println("Adding Sixth Customer ::"
							+ customerSet.add(customer6));
		
		System.out.println("Print all customer details");
		System.out.println(customerSet);
		

	}

}
