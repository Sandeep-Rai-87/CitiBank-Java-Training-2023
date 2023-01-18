package com.citibank.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import com.citibank.main.domain.MyFileReader;

public class MyFileReaderMain {
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the path and file name with extention");
		String path = scanner.next();
		
		File file = new File(path);
		FileReader fileReader = null;
		MyFileReader myFileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			myFileReader = new MyFileReader(bufferedReader);
			
			String data = myFileReader.readFileLineByLine();
			System.out.println(data);
			
		} catch (FileNotFoundException e) {
			System.out.println("Error while opening the file");			
		} finally {
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Error while closing the file and buffer");
			}
			
		}
		
//		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
//		try {
//			fileReader = new FileReader(file);
//			myFileReader = new MyFileReader(file, fileReader);
//			String data = myFileReader.readFile();
//			if (data.equals("")) {
//				System.out.println("Failed to write the file");
//			} else {
//				System.out.println(data);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("Invalid File Read");
//		} finally {
//			try {
//				fileReader.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		

	}

}
