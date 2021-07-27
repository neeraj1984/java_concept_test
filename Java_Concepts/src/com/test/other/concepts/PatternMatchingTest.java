package com.test.other.concepts;

import java.util.regex.Pattern;

public class PatternMatchingTest {
	
	public static void main(String args[])
	{
		String s = "EC 18-028 mlc";
		
		String pattern1 = "\\w{2}\\s\\d{2}-\\d{3}\\s\\w{1}";
		String pattern2 = "\\w{2}\\s\\d{2}-\\d{3}\\s\\w{1,3}"; //it will check from 1 to 3 chars
		
		if(s.toUpperCase().endsWith("D") || s.endsWith("P")) {
			System.out.println("matching...1 "+Pattern.matches(pattern1, s));
		}
		else if(s.toUpperCase().endsWith("MLC")) {
			System.out.println("matching...2 "+Pattern.matches(pattern2, s));
		}
		else {
		System.out.println("Pattern does not match");
			
		}

		
	}

}
