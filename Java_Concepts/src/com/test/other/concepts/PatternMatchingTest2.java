package com.test.other.concepts;

public class PatternMatchingTest2 {
	
	public static void main(String args[]) {
		String str = "[NA]";
		test(str);
	}
	
	public static void test(String inputString) {
		String pattern = "\\*NA";
		if(pattern.matches(inputString)) {
			System.out.println("pattern matches....");
		}else {
			System.out.println("not matching...");
		}
	}

}
