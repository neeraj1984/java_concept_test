package com.test.stream;

public class Staff {
	
	private String name;
	private Integer id;
	private double salary;
	private String city;
	
	
	public Staff(String name, Integer id, double salary, String city) {
		this.name = name;
		this.id = id;
		this.salary= salary;
		this.city= city;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
