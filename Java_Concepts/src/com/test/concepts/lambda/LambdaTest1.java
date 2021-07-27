package com.test.concepts.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest1 {

	public static void main(String[] args) {
		List<Address> abc = getAddress();
		System.out.println("before sorting.....");
		abc.forEach(a-> System.out.println("zip"+ a.getZip()));
		int myZipCode = abc.stream().filter(a->a.getState().equalsIgnoreCase("PPP3")).findFirst().get().getZip();
		System.out.println("my zip code:"+myZipCode);
		
		//new way of sorting
		//Comparator<Address> c = (Address a, Address b) ->b.getState().compareTo(a.getState());
		//Collections.sort(abc, c);
		
		//other way of sorting
		Collections.sort(abc, new NewComparator());
		
		
		System.out.println("after sorting.....");
		abc.forEach(a-> System.out.println("zip"+ a.getZip()));
		
		
		//another way
		abc.sort((Address a, Address b) -> b.getState().compareTo(a.getState()));

	}
	
	public static List<Address> getAddress(){
		List<Address> addressList = new ArrayList<Address>();
		for(int i=0; i<5;i++) {
			Address add = new Address();
			add.setCity("ABC"+i);
			add.setState("PPP"+i);
			add.setZip(100+i);
			addressList.add(add);
		}
		return addressList;
	}
}

class Address{
	String city;
	String state;
	int zip;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}	
}

class NewComparator implements Comparator<Address>{

	@Override
	public int compare(Address first, Address second) {
		return second.getState().compareTo(first.getState());
	}


}
