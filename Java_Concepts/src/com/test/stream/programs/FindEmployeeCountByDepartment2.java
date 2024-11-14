package com.test.stream.programs;


import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FindEmployeeCountByDepartment2 {
	
	public static void main(String args[]) {
		
		List<EmployeeData> empList = DataGeneratorUtility.getAllEmployee2();
		Map<String, Double> empMap = 
				empList.stream()
				.collect(Collectors.groupingBy(EmployeeData :: getDepartment, Collectors.summingDouble(EmployeeData :: getSalary)));
				
		//loop#1
		/*
		for (Entry<String, Double> entry : empMap.entrySet()) {
		    	System.out.println(entry.getKey() + "   " + entry.getValue());
		}
		*/
				
		//loop#2
		empMap.forEach( (k,v) -> System.out.println(k + "     " + v));
	}

}
