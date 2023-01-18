package com.citibank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customer1 = new Customer(101, "Vivek Gohli", "Mumbai");
		Customer customer2 = new Customer(102, "Sandeep Rai", "Nigdi");
		Customer customer3 = new Customer(103, "Uday Nimje", "Chinchwad");
		Customer customer4 = new Customer(104, "Kapli Rawat", "Wagholi");
		Customer customer5 = new Customer(105, "Sameer Saxena", "Mumbai");
		Customer customer6 = new Customer(105, "Sam ", "Mumbai");
		
		List<Customer> customerList = new ArrayList<>();
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		customerList.add(customer6);
		
		printAllCustomers(customerList);
		
		Scanner scanner = new Scanner(System.in);
		
//		try (Scanner scanner = new Scanner(System.in)) {
//			int customerId;
//			System.out.println("Enter Customer ID to print ::");
//			customerId = scanner.nextInt();
//			
//			printCustomerByCustomerId(customerList, customerId);
//		}finally {
//			System.out.println("In scanner finally");
//		}
		
//		int customerId;
//		String name, address;
//		System.out.println("Enter CustomerId ::");
//		customerId = scanner.nextInt();
//		
//		scanner.nextLine();
//		
//		System.out.println("Enter New Name");
//		name = scanner.nextLine();
//		
////		scanner.nextLine();
//		
//		System.out.println("Enter New Address");
//		address = scanner.nextLine();
//		
//		Customer updateCustomer = new Customer(customerId, name, address);
//		updateCustomerByCustomerId(customerList, updateCustomer);
		int customerId;
		System.out.println("Enter Customer ID to delete ::");
		customerId = scanner.nextInt();
		
		System.out.println();
		
		deleteCustomerByCustomerId(customerList, customerId);
		printAllCustomers(customerList);
		
	}
	
	private static void deleteCustomerByCustomerId(List<Customer> customerList, int customerId) {
		boolean flag = false;
		for (Customer customer : customerList) {
			if (customer.getCustomerId() == customerId) {
				customerList.remove(customer);
				System.out.println("Customer deleted successfully " + customerId);
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("No customer details found");
		}
		
	}

	
	private static void updateCustomerByCustomerId(List<Customer> customerList, Customer customer) {
		boolean flag = false;
		for (Customer c : customerList) {
			if (c.getCustomerId() == customer.getCustomerId()) {
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				System.out.println("Customer details updated successfully " + customer);
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("No customer details found");
		}
		
	}
	
	private static void printCustomerByCustomerId(List<Customer> customerList, int customerId) {
		boolean flag = false;
		for (Customer customer : customerList) {
			if (customerId == customer.getCustomerId()) {
				System.out.println("Customer ID Found ::" + customer);
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("Customer ID Not Found !!");
		}
	}
	
	private static void printAllCustomers(List<Customer> custList) {
		System.out.println("All Customers");
		for (Customer customer : custList) {
			System.out.println(customer);
		}
		
	}

}
