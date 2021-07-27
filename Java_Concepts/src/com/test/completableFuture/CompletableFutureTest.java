package com.test.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*
 * CompletableFuture is used for combining asynchronous computation(s) [could be anything, string, int, etc]
 */
public class CompletableFutureTest {
	
	public static void main(String args[]) throws InterruptedException, ExecutionException {
	
		CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(() -> 3);
		
		CompletableFuture<Integer> cf2 = cf.thenApply(a -> a*3);
		
		//thenRun() does not return any value(Takes runnable as argument) except Void
		CompletableFuture<Void> cf3 = cf2.thenRun(() -> System.out.println("hi") );
		
		//cf2.get() gets result of computation
		
		System.out.println("cf2:"+cf2.get()+", cf3:"+cf3.get());
	}
}
