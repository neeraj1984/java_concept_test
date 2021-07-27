package com.test.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingTest {
	
	public static void main(String [] args)
	{		
		List<Employee> objectList = new ArrayList<Employee>();
		objectList.add(new Employee(1,"rbc","dfs"));
		objectList.add(new Employee(2,"ghd","lsa"));
		objectList.add(new Employee(3,"ybc","poi"));
		objectList.add(new Employee(4,"qws","pov"));
		objectList.add(new Employee(5,"wbc","asd"));
		
		Collections.sort(objectList, new EmployeeComparator());
		/*
		Iterator<Employee> it = objectList.iterator();
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.println("empId:"+ emp.getId() + ", firstName:" + emp.getFirstName() + " , lastName:" + emp.getLastName());
		}
		*/
		
		/*
		objectList.stream().forEach(emp -> System.out.println("empId:"+ emp.getId() + ", firstName:" + emp.getFirstName() + " , lastName:" + emp.getLastName()));
		
		objectList.stream().forEach(e -> 
		{
			if(e.getFirstName().equals("abc"))
			{
				System.out.println("emp id:"+e.getId());
			}
		});
		*/
	}

}
