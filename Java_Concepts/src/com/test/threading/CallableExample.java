package com.test.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	
	public static void main(String args[]) {
		
		//lambda
		Callable<String> cb = () -> {
			
			return "my name";
		};
		
		//anonymous class
		Callable<Integer> cb1 = new Callable<Integer>() {
			@Override
			public Integer call() {
				return 100;
			}
		};
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<String> future1 = es.submit(cb);
		Future<Integer> future2 = es.submit(cb1);
		
		try {
			System.out.println(future1.get());
			System.out.println(future2.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
