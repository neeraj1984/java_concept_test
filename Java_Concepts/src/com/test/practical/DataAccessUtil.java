package com.test.practical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.test.stream.Staff;

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
	
	public static List<Staff> getStaff(){
		List<Staff> staffList = new ArrayList<Staff>();
		Staff staff = null;
		
		staff = new Staff("Rakesh", 1201, 35890.0, "Kanpur");		
		staffList.add(staff);
		
		staff = new Staff("Tarun", 1202, 45001.0, "Delhi");		
		staffList.add(staff);
		
		staff = new Staff("Lekha", 1390, 19990.0, "Rampur");		
		staffList.add(staff);
		
		staff = new Staff("Amit", 1382, 41900.0, "Noida");		
		staffList.add(staff);
		
		staff = new Staff("Lalit", 1481, 51200.0, "Kanpur");		
		staffList.add(staff);
		
		staff = new Staff("Madhu", 1518, 24900.0, "Lucknow");		
		staffList.add(staff);
		
		staff = new Staff("Samar", 1278, 38300.0, "Noida");		
		staffList.add(staff);
		
		staff = new Staff("Bablu", 1599, 33750.0, "Delhi");		
		staffList.add(staff);
		
		return staffList;
	}
}
