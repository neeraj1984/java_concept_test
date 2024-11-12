package com.test.practical;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingTesting1 {
	
	//Collections.sort
	//List.sort
	//Stream.sorted
	
	public static void main(String args[]) {
		List<String> nameList = Arrays.asList("neeraj", "ram","ajay", "sam" ,"bimal");
		System.out.println("print all the items in the list");
		nameList.forEach(System.out::println);
		
		//List.sort using Lambda
		nameList.sort((String a, String b) -> a.compareTo(b));
		System.out.println("after sorting using List.sort");
		nameList.forEach(System.out::println);
		
		//List.sort with Lambda with List<Employee>
		List<Employee> fullEmpList1 = DataAccessUtil.getEmployeeList();
		fullEmpList1.sort((a, b) -> a.getName().compareTo(b.getName()));
		System.out.println("sorting with List.sort with Lambda....");
		fullEmpList1.forEach(a -> System.out.println(a.getName()));
		
		//List.sort for reverse sorting
		fullEmpList1.sort(Comparator.comparing(Employee::getName).reversed());
		
		//Collections.sort with List<String>
		List<String> empList = Arrays.asList("neeraj", "ram","ajay", "sam" ,"bimal");
		Collections.sort(empList);
		System.out.println("after sorting using Collections.sort");
		empList.forEach(System.out::println);
				
		//Collections.sort with Lambda with List<Employee>
		List<Employee> fullEmpList2 = DataAccessUtil.getEmployeeList();
		Collections.sort(fullEmpList2, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
		System.out.println("sorting with Collections.sort with Lambda....");
		fullEmpList2.forEach(a -> System.out.println(a.getName()));
		
		//Collections.sort with reverse sorting
		Collections.sort(fullEmpList2, Comparator.comparing(Employee::getName).reversed());
		System.out.println("reversing the list");
		fullEmpList2.forEach(emp -> System.out.println(emp.getName()));
		
		
		//stream.sorted
		List<String> personList = Arrays.asList("neeraj", "ram","ajay", "sam" ,"bimal");
		List<String> pList1 = personList.stream().sorted().collect(Collectors.toList());
		//List<String> pList1 = personList.stream().sorted((String a, String b) -> a.compareTo(b)).collect(Collectors.toList());
		System.out.println("sorted using stream.sorted");
		pList1.forEach(System.out::println);
		
		//stream.sorted with List<Employee>
		List<Employee> fullEmpList3 = DataAccessUtil.getEmployeeList();
		List<Employee> sortedEmpList = fullEmpList3.stream().sorted((emp1, emp2) -> emp1.getName().compareTo(emp2.getName())).collect(Collectors.toList());
		System.out.println("sorted with stream.sorted for list<Employee>");
		sortedEmpList.forEach(emp -> System.out.println(emp.getName()));

	}

}
