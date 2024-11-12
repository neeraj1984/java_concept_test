package com.test.desing.pattern.singleton;

/*
 * this class will check if the solution is creating only one instance of singleton
 */
public class BillPughSolutionTest {
	
	public static void main(String args[]) {
		
		Singleton3 singletonObject1 = Singleton3.getInstance();
		Singleton3 singletonObject2 = Singleton3.getInstance();
		
		//By comparing instance1 and instance2 using ==, we can verify if they refer to the same object in memory.
		if(singletonObject1  == singletonObject2) {
			System.out.println("Instance is same");
		}else {
			System.out.println("instance is not same, its diffrent");
		}
	}

}
