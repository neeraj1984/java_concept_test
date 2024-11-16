package com.test.threading;

/*
 * To simulate race conditions, use a mutable shared resource and avoid thread-safe constructs deliberately.
 */
public class RaceConditionTest {
	
	public static void main(String args[]) {
		
		//int counter = 0;
		int[] counter = {0}; // Mutable wrapper
		
		Runnable task = () -> {
			System.out.println("thread is starting....");
			//counter++;
			for (int i = 0; i < 1000; i++) {
				counter[0]++; // Not thread-safe
				try {
                    Thread.sleep(1); // Add a small delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
			}
		};
				
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		
		thread1.start();
		thread2.start();
		
		try {
            thread1.join();  // main thread waits for thread1 to complete
            thread2.join();  // main thread waits for thread2 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + counter[0]);
		
	}

}


