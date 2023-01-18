package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionTest {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Connection connection = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver Loaded Successfully");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb", "root", "root");
			System.out.println("Connection Successfull !!");
			String sql = "insert into customer_details(name,address) values(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			int i = 0;
			do {
				System.out.println("Enter your name ::");
				String field1 = scanner.next();
				scanner.nextLine();
				System.out.println("Enter your address ::");
				String field2 = scanner.next();
				scanner.nextLine();

				preparedStatement.setString(1, field1);
				preparedStatement.setString(2, field2);
				int rowCount = preparedStatement.executeUpdate();
				if (rowCount > 0) {
					System.out.println("Record inserted successfully - " + rowCount);
				} else {
					System.out.println("No rows inserted");
				}
				i++;
			} while (i < 5);

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Driver not found !!");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Main End");

	}

}
