package com.test.stream.programs;

import java.util.List;

public class FindTotalMaleAndFemaleCount {
	
	public static void main(String args[]) {
		List<PersonData> personList = DataGeneratorUtility.getAllPeople();
		List<PersonData> maleList = getAllMale(personList);
		List<PersonData> femaleList = getAllFemale(personList);
		System.out.println("males....");
		maleList.forEach(person -> System.out.println("name: "+person.getName()));
		
		System.out.println("females....");
		femaleList.forEach(person -> System.out.println("name: "+person.getName()));
	}
	
	public static List<PersonData> getAllMale(List<PersonData> personList){
		List<PersonData> maleList = personList.stream().filter(person -> person.getGender().equalsIgnoreCase("M")).toList();
		return maleList;
	}
	
	public static List<PersonData> getAllFemale(List<PersonData> personList){
		List<PersonData> femaleList = personList.stream().filter(person -> person.getGender().equalsIgnoreCase("F")).toList();
		return femaleList;
	}
}
