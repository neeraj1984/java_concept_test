package com.test.concepts;

import java.util.Collection;
import java.util.HashSet;

public class TestConcepts {
	
	public static void main(String args[])
	{
		Collection<Long> longTest = new HashSet<Long>();
		longTest.add(100L);
		longTest.add(200L);
		longTest.add(300L);
		
		System.out.println(longTest);
	}

}
