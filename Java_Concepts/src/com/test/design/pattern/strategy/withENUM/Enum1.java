package com.test.design.pattern.strategy.withENUM;

//passing param to enum constant example
public enum Enum1 {
	a1(new Test("neeraj")),
	a2(new Test("joshi")){
		
	};
	
	Test t;
	//constructor can ONLY be private or without modifier(no public/protected) in enum
	private Enum1(Test t) {
		this.t = t;
	}
	
	

}

class Test{
	private String name;
	
	public Test(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

