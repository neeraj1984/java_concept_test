package com.test.desing.pattern.strategy;

/*
 * the strategy pattern (also known as the policy pattern) is a behavioral software design pattern that enables 
 * selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives 
 * runtime instructions as to which in a family of algorithms to use.
 */

public class StrategyDemo {
	
	public static void main(String args[])
	{
		Context con1 = new Context(new AddOperation());
		con1.executeOperation(10, 20);
		
		Context con2 = new Context(new SubtractOperation());
		con2.executeOperation(45, 23);
		
		Context con3 = new Context(new MultiplyOperation());
		con3.executeOperation(5, 7);
	}

}
