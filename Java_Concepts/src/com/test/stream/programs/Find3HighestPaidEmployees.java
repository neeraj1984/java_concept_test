package com.test.stream.programs;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Find3HighestPaidEmployees {

	
public static void main(String args[]) {
		
		List<EmployeeData> empList = DataGeneratorUtility.getAllEmployee();
		List<EmployeeData> empData = findHighestSalaryEmployee(empList);
		
		empData.stream()
		.forEach(emp -> 
			System.out.println("Second Highest Salary employee name: "+emp.getEmpName() + " with salary: "+emp.getSalary()));
	}
	
	public static List<EmployeeData> findHighestSalaryEmployee(List<EmployeeData> empList) {
						
				List<EmployeeData> empData = empList.stream()
				.sorted(Comparator.comparingDouble(EmployeeData::getSalary).reversed()).limit(3).toList();
				
				
				List<EmployeeData> empData2 = empList.stream()
						.sorted(Comparator.comparingDouble(EmployeeData::getSalary).reversed()).limit(3).collect(Collectors.toList());
			
		return empData;
	}
}
