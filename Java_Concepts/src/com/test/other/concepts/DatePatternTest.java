package com.test.other.concepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePatternTest {
	
	public static void main(String [] args) {
		String inputDateValue = "na";
		boolean check = testDatePattern(inputDateValue);
		System.out.println("date is valid? "+check);
	}
	
	public static boolean testDatePattern(String inputDateValue) {
		boolean retval = false;
		String datePattern = "MM/dd/yyyy";
		String maxDateString = "01/01/2100";
		SimpleDateFormat formatter = new SimpleDateFormat(datePattern);
		formatter.setLenient(false);
		try {
			  if("NA".equalsIgnoreCase(inputDateValue) || "TBD".equalsIgnoreCase(inputDateValue)) {
				  retval = true;
				  return retval;
			  }
			  Date inputDate = formatter.parse(inputDateValue);
			  Date maxDate = formatter.parse(maxDateString);
			  if(inputDate.before(maxDate)) {
				  retval = true;  
			  }			  
			  
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return retval;
	}

}
