package com.test.practical;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperationTest1 {

	public static void main(String args[]) {
		
		List<Employee> empList = DataAccessUtil.getEmployeeList();
		System.out.println("printing IDs of all records");
		empList.forEach(a -> System.out.print(a.getId()));
		
		//map operation
		List<String> myList1 = empList.stream().map(a -> a.getName()).collect(Collectors.toList());
		System.out.println("\nprinting mapping result");
		myList1.forEach(System.out::print);
		
		//map and filter
		List<Integer> myList2 = empList.stream().map(a -> a.getId()).filter(b -> b > 3).collect(Collectors.toList());
		System.out.println("\nprinting map and filter result");
		myList2.forEach(a -> System.out.print(a));
		
		//limit
		List<Integer> myList3 = empList.stream().map(emp -> emp.getId()).filter(b -> b > 2).limit(2).collect(Collectors.toList());
		System.out.println("\nlimit in stream");
		System.out.println(myList3);
		
		//group by
		Map<String, List<Employee>> myMap = empList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.toList()));
		System.out.println("\nprinting grouping results");
		System.out.println(myMap);
		
		//flat map
		Set<String> skillSet  = empList.stream().map(a -> a.getSkills()).flatMap(b -> b.stream()).collect(Collectors.toSet());
		System.out.println("all unique skills: "+skillSet);
		List<String> skillsList = empList.stream().map(emp -> emp.getSkills()).flatMap(skillsSet -> skillsSet.stream()).collect(Collectors.toList());
		System.out.println("all skills: ");
		skillsList.forEach(System.out::println);
		
	}
	
}
