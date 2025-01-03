package com.test.stream.programs;

import java.util.List;
import java.util.stream.Collectors;

public class FindAverageSalary {
	
	public static void main(String args[]) {
		
		List<EmployeeData> empList = DataGeneratorUtility.getAllEmployee();
		
		Double averageSalary = empList.stream().collect(Collectors.averagingDouble(EmployeeData :: getSalary));
		
		System.out.println("average salary:: "+averageSalary);
		
	}

}
