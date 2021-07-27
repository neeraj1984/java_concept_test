package com.test.concepts.lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputTest1 {

	public static void main(String args[]) {
		userInputMethod1();
		userInputMethod2();
		userInputMethod3();
	}

	/* With Scanner */
	public static void userInputMethod1() {
		System.out.println("With Scanner....");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//String str2 = sc.next();
		System.out.println("provided input from user is:" + str);

		int x = sc.nextInt();
		System.out.println("user input int:" + x);
		//sc.close(); //closing it here will result null for next read of user input
	}

	/* using BufferedReader */
	public static void userInputMethod2() {
		System.out.println("With BufferedReader....");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name;
		try {
			name = reader.readLine();
			System.out.println("bufferedReader input:"+name);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/* using Console,normally Console is null (this is bug in eclipse) */
	/* it will work from terminal */
	public static void userInputMethod3() {
		System.out.println("With Console....");
		String name = System.console() != null ? System.console().readLine() : null;
        System.out.println(name);
	}

}
