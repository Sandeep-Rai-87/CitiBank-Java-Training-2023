package com.citibank.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import com.citibank.main.domain.MyFileWriter;

public class MyFileWriterMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Writer writer = null;
		System.out.println("Enter the file path and extension");
		String path = scanner.next();
		System.out.println("Enter data to the file");
		String data = scanner.next();
		File file = new File(path);
		try {
			writer = new FileWriter(file);
		} catch (IOException e) {
			System.out.println("Error is file writing");
		} 
		MyFileWriter fileWriter = new MyFileWriter(writer, data);
		boolean isSuccess = fileWriter.writeFile();	
		if (isSuccess) {
			System.out.println("File Write Successfully");
		}

	}

}
