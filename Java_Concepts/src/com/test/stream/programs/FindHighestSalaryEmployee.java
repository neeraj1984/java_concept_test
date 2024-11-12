package com.test.stream.programs;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindHighestSalaryEmployee {
	
	public static void main(String args[]) {
		
		List<EmployeeData> empList = DataGeneratorUtility.getAllEmployee();
		EmployeeData emp = findHighestSalaryEmployee(empList);
		System.out.println("Highest Salary employee name: "+emp.getEmpName() + " with salary: "+emp.getSalary());
	}
	
	public static EmployeeData findHighestSalaryEmployee(List<EmployeeData> empList) {
		
		Optional<EmployeeData> highestSalaryEmp = 				
				empList.stream()
				.sorted(Comparator.comparingDouble(EmployeeData::getSalary).reversed())
				.findFirst();
			
		return highestSalaryEmp.get();
	}

}
