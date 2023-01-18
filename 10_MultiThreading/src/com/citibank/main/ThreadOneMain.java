package com.citibank.main;

import com.citibank.main.domain.ThreadOne;

public class ThreadOneMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		ThreadOne threadOne = new ThreadOne();
		
		threadOne.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("main ::" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Exception in threadone main ");
				e.printStackTrace();
			}
		}
//		threadOne.run();
		
		System.out.println("Main End");

	}

}
