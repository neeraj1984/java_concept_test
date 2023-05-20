package com.test.practical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataAccessUtil {

	
	public static List<Employee> getEmployeeList(){
		List<Employee> empList = new ArrayList<Employee>();
		Employee e = null;
		
		Set<String> skillSet = null;
		skillSet =	new HashSet<String>();
		skillSet.add("Java");
		skillSet.add("Python");
		
		e = new Employee(1, "Neeraj", skillSet );
		empList.add(e);
		
		skillSet =	new HashSet<String>();
		skillSet.add("Dot Net");
		skillSet.add("Database");
		
		e = new Employee(2, "Sam", skillSet );
		empList.add(e);
		
		skillSet =	new HashSet<String>();
		skillSet.add("Java");
		skillSet.add("Oracle");
		
		e = new Employee(3, "Mark", skillSet );
		empList.add(e);
		
		
		skillSet =	new HashSet<String>();
		skillSet.add("Informatica");
		skillSet.add("Data Science");
		
		e = new Employee(4, "Ram", skillSet );
		empList.add(e);
		
		
		skillSet =	new HashSet<String>();
		skillSet.add("Groovy");
		skillSet.add("Unix");
		
		e = new Employee(5, "Sam", skillSet );
		empList.add(e);
		
		skillSet =	new HashSet<String>();
		skillSet.add("Big Data");
		skillSet.add("Java");
		
		e = new Employee(6, "Brian", skillSet );
		empList.add(e);
		
		return empList;
	}
}
