package com.test.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MilisecondsToDate {
	public static void main(String args[]) {
		
		// milliseconds 
        long miliSec = 171865277; 
  
        // Creating date format 
        DateFormat simple = new SimpleDateFormat("mm/dd/yyyy HH:mm:ss:SSS"); 
  
        // Creating date from milliseconds 
        // using Date() constructor 
        Date result = new Date(miliSec); 
  
        // Formatting Date according to the 
        // given format 
        System.out.println(simple.format(result));
        
        long currentDateTime = System.currentTimeMillis();
        Date currentDate = new Date(currentDateTime);
        System.out.println("current Date: " + currentDate + ", miliseconds:"+currentDateTime);
	}

}
