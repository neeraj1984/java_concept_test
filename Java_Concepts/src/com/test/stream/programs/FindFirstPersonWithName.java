package com.test.stream.programs;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class FindFirstPersonWithName {
	
	public static void main(String args[]) {
		
		List<PersonData> peopleList = DataGeneratorUtility.getAllPeople();
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		String city = findFirstPersonWithName(peopleList,name);
		if(!city.isEmpty()) {
			System.out.println("name: "+name + ", city: "+city);
		}else {
			System.out.println("Person with the name "+name + " not found");
		}
		
		sc.close();
	}
	
	public static String findFirstPersonWithName(List<PersonData> peopleList, String nameToBeSearched) {
		String retval = "";
		Optional<PersonData> person = peopleList.stream().filter(people -> people.getName().equalsIgnoreCase(nameToBeSearched)).findFirst();
		if(person.isPresent()) {
			retval = person.get().getCity();
		}
		return retval;
	}

}
