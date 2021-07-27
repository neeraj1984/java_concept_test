package com.test.other.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.test.sorting.Employee;

public class SortingTest2 {
	
	public static void main(String args[])
	{
		Function<Integer,String> testFunction = (a) -> Float.toString(a.byteValue());
		
		System.out.println("byte representation of "+ 1234 +" is " + testFunction.apply(1234));
		
		List<Employee> empList = populateList();
		
		empList.sort((o1,o2) -> o1.getFirstName().compareTo(o2.getFirstName()) );
		
		System.out.println("sorted by first name......");
		empList.stream().forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));
		
		
		empList.sort((o1,o2) ->
		{
			int sortByFirstName = o1.getFirstName().compareTo(o2.getFirstName());
			if(sortByFirstName == 0)
			{
				int sortByLastName = o1.getLastName().compareTo(o2.getLastName());
				return sortByLastName;
			}
			return sortByFirstName;
		});
		
		System.out.println("sorted by first name and last name......");
		empList.stream().forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));
		
	}
	
	
	public static List<Employee> populateList()
	{
		List<Employee> objectList = new ArrayList<Employee>();
		
		Supplier<Object> testSupplier = ArrayList :: new;
		
		
		
		objectList.add(new Employee(1,"Ram","Kumar"));
		objectList.add(new Employee(2,"Amar","Singh"));
		objectList.add(new Employee(3,"Neha","Rajput"));
		objectList.add(new Employee(4,"Amar","Kapoor"));
		objectList.add(new Employee(5,"Fatima","Khan"));
		
		return objectList;
	}

}
