package com.test.practical;

import java.util.Set;

public class Employee {

	Integer id;
	String name;
	Set<String> skills;
	
	Employee(Integer id, String name, Set<String> skills){
		this.id = id;
		this.name = name;
		this.skills = skills;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	
	@Override
	public String toString() {
		return "id:"+this.id + ", name: "+ this.getName() + ", skills: "+this.getSkills();
	}
}
