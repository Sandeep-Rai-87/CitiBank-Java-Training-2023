package com.citibank.main;

import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class ConnectionMain {
	public static void main(String[] args) {
		List<Customer> customerList = new ArrayList<>();
		System.out.println("---------------All Customer-----------------");
		CustomerService customerService = new CustomerService();
		customerService.getAllCustomers();

		customerList = customerService.getAllCustomers();

		for (Customer customer : customerList) {
			System.out.println(customer);
		}

//		System.out.println("---------------Customer by Customer ID-----------------");
//		Customer customer = new Customer();
//		CustomerService customerService2 = new CustomerService();
//		customer = customerService2.getCustomerByCustomerId(5);
//		if (customer != null) {
//			System.out.println("Customer found ::" + customer);
//		} else {
//			System.out.println("Customer not found !!");
//		}
//
//		System.out.println("-----------------Add New Customer-----------------------");
//		Customer customer1 = new Customer(0, "Nakul", "Nagar");
//		CustomerService customerService3 = new CustomerService();
//		boolean isAdd = customerService3.addNewCustomer(customer1);
//
//		if (isAdd) {
//			System.out.println("Insert Successfully !!");
//
//		}
//
//		System.out.println("-----------------Update Customer-----------------------");
//		Customer customer2 = new Customer(4, "Mukul", "Nagar");
//		CustomerService customerService4 = new CustomerService();
//		boolean isUpdate = customerService4.updateCustomerByCustomerId(customer2);
//
//		if (isUpdate) {
//			System.out.println("Update Successfully !!");
//
//		}
//		
//		System.out.println("-----------------Delete Customer-----------------------");
//		CustomerService customerService5 = new CustomerService();
//		boolean isDelete = customerService5.deleteCustomerByCustomerId(8);
//
//		if (isDelete) {
//			System.out.println("Deleted Successfully !!");
//
//		}

	}
}
