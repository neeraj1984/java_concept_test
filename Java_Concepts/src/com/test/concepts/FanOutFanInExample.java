package com.test.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FanOutFanInExample {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
        int numberOfTasks = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfTasks);
        System.out.println("test commit print");

        // Fan-out phase
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < numberOfTasks; i++) {
            Callable<Integer> task = () -> {
                int number = new Random().nextInt(100); // Generating a random number
                System.out.println("Task " + number + " running on " + Thread.currentThread().getName());
                return number * number; // Calculating the square of the number
            };
            futures.add(executorService.submit(task));
        }

        // Fan-in phase
        List<Integer> results = new ArrayList<>();
        for (Future<Integer> future : futures) {
            results.add(future.get()); // Collecting the results
        }
        
        // Printing the final results
        System.out.println("Final Results:");
        for (int i = 0; i < numberOfTasks; i++) {
            System.out.println("Task " + i + " result: " + results.get(i));
        }

        // Shutting down the executor service
        executorService.shutdown();
    }

}
