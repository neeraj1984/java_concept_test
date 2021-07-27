package com.test.concepts;

public class SystemPropertiesCheck {

	public static void main(String args[]) {
		System.out.println("sys prop:"+System.getProperty("user.dir"));
		
		boolean bool1 = false;
		boolean bool2 = true;
		
		if(!bool1 && !bool2) {
			System.out.println("both are false");
		}else {
			System.out.println(" any 1 could be true");
		}
	}
}
