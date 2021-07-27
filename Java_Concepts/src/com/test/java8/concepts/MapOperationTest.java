package com.test.java8.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperationTest {

	public static void main(String args[]) {
		List<String> abc = new ArrayList<String>();				
		abc.add("1");
		abc.add("2");
		
		List<List<String>> aList = new ArrayList<List<String>>();
		aList.add(abc);
		
		List<Integer> xyz = abc.stream().map( a-> Integer.valueOf(a)).collect(Collectors.toList());
		
		
		List<String> ww = aList.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
		
		List<Integer> aa = aList.stream().flatMap(a -> a.stream().map(x -> Integer.valueOf(x))).collect(Collectors.toList());
		
	}
	
	
	
	
}
