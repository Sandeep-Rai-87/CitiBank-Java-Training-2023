package com.citibank.main;

import com.citibank.main.domain.GoodAfternoonGreeter;
import com.citibank.main.domain.Greeter;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter greeter = new GoodAfternoonGreeter();
		
		greeter.greet();

		Greeter goodEvening = new Greeter() {

			@Override
			public void greet() {
				System.out.println("Good Evening Java");

			}
		};

		goodEvening.greet();

		Greeter goodAfternoon = new Greeter() {

			@Override
			public void greet() {
				System.out.println("Good Afternoon Java");

			}
		};
		goodAfternoon.greet();
// Anonymous class to replace creating a new class to write/call the method
		Greeter goodMorning = new Greeter() {

			@Override
			public void greet() {
				System.out.println("Good Morning Java");

			}
		};
		goodMorning.greet();
		
		Greeter myWay = () -> {
		System.out.println("My Way !! - This is lambda code"); // -> is lambda expression and is used to replace anonymous class
		};
		myWay.greet();
		
		Runnable runnable = () -> System.out.println("We are in thread");
		Thread thread = new Thread(runnable);
		thread.start();
		
		System.out.println("---------------------------");
		
		Thread thread2 = new Thread(
				() -> System.out.println("We are in new way of thread")
				);
		thread2.start();
		
		System.out.println("---------------------------");
		
		new Thread(() -> System.out.println("We are in another new way of thread")).start();
		
		System.out.println("---------------------------");
		
		new Thread(() -> {
			for (int i= 0; i < 10; i++) {
				System.out.println("Thread sleeping ::" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	

	}

}
