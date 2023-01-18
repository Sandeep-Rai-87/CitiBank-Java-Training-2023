package com.citibank.main;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class CustomerMainV2 {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		Customer customer1 = new Customer(101, "Vivek Gohil", "Mumbai");
		Customer customer2 = new Customer(101, "Kapil Rawat", "Wagholi");
		Customer customer3 = new Customer(101, "Uday Nimje", "Chinchwad");
		Customer customer4 = new Customer(101, "Sandeep Rai", "Nigdi");
		Customer customer5 = new Customer(101, "Sameer Saxena", "Mumbai");

		System.out.println("Adding First Customer ::" + customerService.addNewCustomer(customer1));
		System.out.println("Adding Second Customer ::" + customerService.addNewCustomer(customer2));
		System.out.println("Adding Third Customer ::" + customerService.addNewCustomer(customer3));
		System.out.println("Adding Fourth Customer ::" + customerService.addNewCustomer(customer4));
		System.out.println("Adding Fifth Customer ::" + customerService.addNewCustomer(customer5));

		System.out.println("==========================");
		System.out.println("Printing/Reading all customer data from database/list");
		List<Customer> customerList = customerService.getAllCustomers();
		for (Customer customer : customerList) {
			System.out.println(customer);
		}

		System.out.println("--------------------------");
		System.out.println("Printing one customer based on customer ID");

		Customer customer = customerService.getCustomerByCustomerId(101);
		System.out.println(customer);

		System.out.println("--------------------------");
		System.out.println("Updating customer based on customer ID");
		Customer customerUpdate = new Customer(101, "Vivek", "Bombay");
		boolean result = customerService.updateCustomerByCustomerId(customerUpdate);
		if (result) {
			System.out.println(customerUpdate);
			System.out.println("Updated Successfully");
		} else
			System.out.println("No Customer Found !!");

		System.out.println("-------------------------");
		System.out.println("Deleting customer based on customer ID");
		customerService.deleteCustomerByCustomerId(101);
		System.out.println(customer);

	}

}
