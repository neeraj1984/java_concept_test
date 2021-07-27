package com.test.java8.concepts;

import java.util.Scanner;

public class StringTest1 {

	public static void main(String args[]) {
		System.out.print("please provide your input....");
		Scanner sc = new Scanner(System.in);
		String abc = sc.next();
		char arr[] = new char[abc.length()];
		
		for(int i =0; i < abc.length(); i++) {
			arr[i] = abc.charAt(i);
		}
		StringBuffer sb = new StringBuffer();
		for(char c : arr) {
			sb.append(c);
			sb.append(", ");
		}
		
		String result = sb.toString().substring(0, sb.length()-2);
		System.out.println(result);
		
	}
}
