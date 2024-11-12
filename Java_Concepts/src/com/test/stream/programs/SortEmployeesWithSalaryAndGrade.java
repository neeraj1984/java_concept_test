package com.test.stream.programs;

import java.util.Comparator;
import java.util.List;

public class SortEmployeesWithSalaryAndGrade {
	
	public static void main(String args[]) {
		
		List<EmployeeData> empList = DataGeneratorUtility.getAllEmployee2();
		
		List<EmployeeData> sortedList = empList.stream().
				sorted(Comparator.comparingDouble(EmployeeData :: getSalary).reversed().thenComparing(EmployeeData :: getGrade)).
				toList();
		
		sortedList.forEach(emp -> System.out.println("emp name:"+emp.getEmpName() + ", salary: "+emp.getSalary() + ", grade: "+emp.getGrade()));
	}

}
