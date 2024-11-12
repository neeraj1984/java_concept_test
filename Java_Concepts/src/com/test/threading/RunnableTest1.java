package com.test.threading;

public class RunnableTest1 {

	
	public static void main(String args[]) {
		
		//way#1
		Runnable r1 = () -> {
			
			String retval = "hello";
			System.out.println("runnable with lambda: "+retval);
		};
		
		new Thread(r1).start();
		
		//way#2
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("anonymous class thread");
			}
		};
		new Thread(r2).start();
	}
}
