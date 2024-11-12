package com.test.stream.programs;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestSalary {

	public static void main(String args[]) {
		
		List<EmployeeData> empList = DataGeneratorUtility.getAllEmployee();
		EmployeeData emp = findHighestSalaryEmployee(empList);
		System.out.println("Second Highest Salary employee name: "+emp.getEmpName() + " with salary: "+emp.getSalary());
	}
	
	public static EmployeeData findHighestSalaryEmployee(List<EmployeeData> empList) {
		
		Optional<EmployeeData> secondHighestSalaryEmp = 				
				empList.stream()
				.sorted(Comparator.comparingDouble(EmployeeData::getSalary).reversed()).skip(1)
				.findFirst();
			
		return secondHighestSalaryEmp.get();
	}
}
