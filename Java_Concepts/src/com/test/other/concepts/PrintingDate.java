package com.test.other.concepts;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class PrintingDate {

	public static void main(String args[]) {
		getDisplayBuildTime();
	}


	public static void getDisplayBuildTime() {
		//TimeZone tzone = TimeZone.getTimeZone("EST");
		DateFormat dateFormat = new SimpleDateFormat("EEE yyyy/MM/dd HH:mm:ss z");
		//dateFormat.setTimeZone(tzone);
		TimeZone.setDefault(TimeZone.getTimeZone("EST"));
		java.util.Date date = new java.util.Date();
		String dateStr = dateFormat.format(date);
		java.util.Date date2 = null;
		try {
			date2 = dateFormat.parse(dateStr);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		java.sql.Timestamp sqldate = new java.sql.Timestamp(date2.getTime());
		System.out.println(sqldate);
		

	}

}
