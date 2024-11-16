package com.test.threading;

public class ThreadingTest2 {
	
	public static void main(String args[]) {
		
		//passing Runnable as an lambda argument to the Thread(runnable)
		Thread t1 = new Thread(() ->{
			System.out.println("Thread1: ");
		});
		
		t1.start();
	}

}
