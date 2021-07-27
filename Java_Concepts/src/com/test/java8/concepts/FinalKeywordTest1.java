package com.test.java8.concepts;

public class FinalKeywordTest1 {
	
	final static Test t = new Test();
	public static void main(String args[]) {
		String regEx = "[^a-zA-Z0-9_-]";
		String name = "?-neeraj?123??";
		String newString = name.replaceAll(regEx, "");
		System.out.println("new name:"+newString);
		t.setName("hi");
		//t = new Test();
		System.out.println("byte min val:"+Byte.MIN_VALUE+", byte max val:"+Byte.MAX_VALUE);
		System.out.println("short min val:"+Short.MIN_VALUE + ", short max val:"+Short.MAX_VALUE);
		System.out.println("int min:"+Integer.MIN_VALUE + ", int max:"+Integer.MAX_VALUE);
		System.out.println("log min val:"+Long.MIN_VALUE +", long max val:"+Long.MAX_VALUE);
		System.out.println("double min val:"+Double.MIN_EXPONENT + ", double max val:"+Double.MAX_EXPONENT);
		
		
	}

}
class Test{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
