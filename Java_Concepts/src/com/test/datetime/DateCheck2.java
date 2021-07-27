package com.test.datetime;

import java.util.Date;

public class DateCheck2 {

	public static void main(String args[]) {
		Long time1 = System.currentTimeMillis();
		Date date1 = new Date(time1);
		String abc = "";
		//100000000 - 100 Milion
		for(int i =0; i < 100000000; i++) {
			abc = Integer.toString(i);
		}
		Long time2 = System.currentTimeMillis();
		Date date2 = new Date(time2);
		
		System.out.println("date1:"+date1+"\ndate2:"+date2);
	}
}
