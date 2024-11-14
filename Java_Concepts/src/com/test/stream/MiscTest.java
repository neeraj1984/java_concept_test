package com.test.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import com.test.practical.DataAccessUtil;

public class MiscTest {
	
	public static void main(String args[]) {
		
		List<Staff> staffList = DataAccessUtil.getStaff();
		
		//sorting with stream().sorted()
		List<Staff> mutableList = staffList.stream()
				.sorted(Comparator.comparingDouble(Staff :: getSalary))
				.collect(Collectors.toList());
		
		System.out.println("printing mutableList....");
		mutableList.forEach(staff ->System.out.println(staff.getName() + ": " +staff.getSalary()));
		
		
		List<Staff> mutableList2 = staffList.stream()
			.sorted((staff1,staff2) -> staff1.getName().compareTo(staff2.getName()))
				.collect(Collectors.toList()); //mutable List
		
		//get immutable list with java 16, this can not be modified
		List<Staff> immutableList = staffList.stream()
				.sorted(Comparator.comparingDouble(Staff :: getSalary))
				.toList();
		
		System.out.println("printing immutableList....");
		immutableList.forEach(staff ->System.out.println(staff.getName() + ": " +staff.getSalary()));
		
		//immutableList.add(new Staff("abc", 1, 1001.0, "test")); // with throw java.lang.UnsupportedOperationException
		
		testRunnable();
		
		
	}
	
	public static void testRunnable() {
		try {
		Runnable r1 = () -> {
			System.out.println("hi");
		};
		
		ExecutorService es = Executors.newFixedThreadPool(1);
		Future future = es.submit(r1);
		
		System.out.println("checking: "+future.get());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
