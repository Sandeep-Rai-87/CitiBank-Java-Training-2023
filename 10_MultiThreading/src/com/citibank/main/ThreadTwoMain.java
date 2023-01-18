package com.citibank.main;

import com.citibank.main.domain.ThreadTwo;

public class ThreadTwoMain {

	public static void main(String[] args) {
		System.out.println("ThreadTwo Main Started");
//		ThreadTwo threadTwo = new ThreadTwo();  // or use this way to create the variable
		Thread thread = new Thread(new ThreadTwo());

		thread.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("main ::" + i);
			try {
				thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("ThreadTwo Main End");
	}

}
