package com.test.stream.programs;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesBySalary {

	public static void main(String args[]) {
		
	}
	
	public static List<EmployeeData> sortBySalary(){
		
		List<EmployeeData> empList = DataGeneratorUtility.getAllEmployee2();
		
		//Way#1
		List<EmployeeData> sortedList1 = empList.stream().sorted((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary())).toList();
		
		//Way#2
		List<EmployeeData> sortedList2 = empList.stream().sorted(Comparator.comparingDouble(EmployeeData:: getSalary)).toList();
		
		//Way#3
		empList.sort((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()));
		
		//Way#4
		empList.sort(Comparator.comparingDouble(EmployeeData::getSalary));
		
		//Way#5
		Collections.sort(empList, (emp1, emp2)-> emp1.getSalary().compareTo(emp2.getSalary())  );
		
		//Way#6
		Collections.sort(empList, Comparator.comparingDouble(EmployeeData::getSalary));
		
		List<EmployeeData> sortedTestList = empList.stream().sorted((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary())).collect(Collectors.toList());
		
		return empList;
	}
}
