package com.citibank.main.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.factory.ConnectionFactory;

public class CustomerRepository implements CustomerRepositoryInterface {
	
	private List<Customer> customerList = new ArrayList<>();
	
//	private String driverName = "com.mysql.cj.jdbc.Driver";
//	private String url = "jdbc:mysql://localhost:3306/citibankdb";
//	private String userId = "root";
//	private String password = "root";
	private String sql;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private int rowCount;	

	@Override
	public boolean addNewCustomer(Customer customer) {
		connection = new ConnectionFactory().getConnection();
		sql = "insert into customer_details(name,address) values(?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2,  customer.getAddress());
			
			rowCount = preparedStatement.executeUpdate();
			if (rowCount > 0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return customerList.add(customer);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		connection = new ConnectionFactory().getConnection();
		sql = "select * from customer_details where customer_id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				
				customerId = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				
				Customer customer = new Customer(customerId, name, address);
				
				return customer;
			}
		} catch (SQLException e) {
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Error in connection close");
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		connection = new ConnectionFactory().getConnection();
		sql = "select * from customer_details";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int customerId = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				
				Customer customer = new Customer(customerId, name, address);
				customerList.add(customer);
			}
		} catch (SQLException e) {
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Error in connection close");
				e.printStackTrace();
			}
		}
		return customerList;

	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		connection = new ConnectionFactory().getConnection();
		sql = "update customer_details set name = ?, address = ? where customer_id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			preparedStatement.setInt(3, customer.getCustomerId());
			
			rowCount = preparedStatement.executeUpdate();
			
			if (rowCount > 0)
				return true;
			
		} catch (SQLException e) {
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Error in connection close");
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		connection = new ConnectionFactory().getConnection();
		sql = "delete from customer_details where customer_id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
						
			rowCount = preparedStatement.executeUpdate();
			
			if (rowCount > 0)
				return true;
			
		} catch (SQLException e) {
			System.out.println("Exception in query execution");
			System.out.println(e.getMessage());
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Error in connection close");
				e.printStackTrace();
			}
		}
		return false;
	}

}
