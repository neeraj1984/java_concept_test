package com.test.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadingTest1 {
	public static void main(String args[]) throws InterruptedException, ExecutionException {

		// way#1
		Thread t1 = new MyClass(); //programming to an interface
		//MyClass t1 = new MyClass();
		t1.start();

		// way#2
		YourClass yc = new YourClass();
		Thread t2 = new Thread(yc);
		t2.start();

		// way#3
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> future1 = executorService.submit(new HisClass());
		System.out.println(future1.get());

		// with Lambda#1
		Runnable abc = () -> {
			System.out.println("with lambda");
		};
		Thread t4 = new Thread(abc);
		t4.start();

		// with anonymous class
		Runnable xyz = new Runnable() {

			@Override
			public void run() {
				System.out.println("with anonymous");
			}
		};
		new Thread(xyz).start();

		System.out.println("all done....");
		executorService.shutdown();
	}

}

class MyClass extends Thread {

	public void run() {
		System.out.println("running MyClass");
	}
}

class YourClass implements Runnable {

	@Override
	public void run() {
		System.out.println("running YourClass");

	}

}

class HisClass implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("running HisClass");
		return "Hello";
	}

}