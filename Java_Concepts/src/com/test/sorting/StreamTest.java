package com.test.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamTest {
	
	public static void main(String args[])
	{
		
		List<Employee> objectList = populateList();
		
		Optional<String> retVal = objectList.stream().map(e -> e.getFirstName()).findFirst();
		if(retVal.isPresent())
		{
			System.out.println("value : "+retVal.get());
		}
		
		objectList.stream().forEach(e -> System.out.println(e.getId()));
		
		
	}
	
	
	public static List<Employee> populateList()
	{
		List<Employee> objectList = new ArrayList<Employee>();
		objectList.add(new Employee(1,"abc","dfs"));
		objectList.add(new Employee(2,"ghd","lsa"));
		objectList.add(new Employee(3,"abc","poi"));
		objectList.add(new Employee(4,"qws","pov"));
		objectList.add(new Employee(5,"abc","asd"));
		
		return objectList;
	}

}
