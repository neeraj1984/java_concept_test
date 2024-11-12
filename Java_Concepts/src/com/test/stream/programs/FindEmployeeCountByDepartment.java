package com.test.stream.programs;

import java.util.List;
import java.util.Scanner;

public class FindEmployeeCountByDepartment {

	public static void main(String args[]) {
		
		List<EmployeeData> empList = DataGeneratorUtility.getAllEmployee2();
		System.out.println("provide department to be searched....");
		Scanner sc = new Scanner(System.in);
		String department = sc.nextLine();
		Integer count = getEmployeeCountByDepartment(empList,department);
		
		System.out.println("Total employees in "+ department + " department are "+count);
		sc.close();
	}
	
	public static Integer getEmployeeCountByDepartment(List<EmployeeData> empList, String department) {
		
		Long count = empList.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase(department)).count();
		
		return count.intValue();
	}
}
