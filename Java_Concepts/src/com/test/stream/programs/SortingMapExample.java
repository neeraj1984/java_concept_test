package com.test.stream.programs;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * The code passed into to Collectors.toMap() method are as follow: 
 *   - the first parameter is used as a key
 *   - the second is used as a value
 *   - the third is used to break ties i.e. if two entries are equal then which entries will be chosen is decided by the third parameter, here we are using the second entry.
 *   - The fourth parameter is the important one, which uses a "constructor reference" to tell Collector that copying a LinkedHashMap should be used. 
 */

public class SortingMapExample {
	
	public static void main(String args[]) {
		
		List<EmployeeData> empList = DataGeneratorUtility.getAllEmployee2();
		Map<String, Double> empMap = 
				empList.stream()
				.collect(Collectors.groupingBy(EmployeeData :: getDepartment, Collectors.summingDouble(EmployeeData :: getSalary)));
		
		//sorting the map with keys - toMap() will returns HashMap by default, we need LinkedHashMap to keep the order.
		 Map<String, Double> resultMap = empMap.entrySet().stream()
		  .sorted(Map.Entry.comparingByKey())
		  .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue,  (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		 
		 resultMap.forEach((k,v) -> System.out.println(k + "  " +v));
	}

}
