package com.test.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Locale;

public class NewDateTimeAPITest2 {
	
	public static void main(String[] args)
	{
		
		test1();
		test2();
		test3();
		test4();
		formating();
	}
	
	static void test1()
	{
		LocalDate date1 = LocalDate.parse("2020-02-13").plusDays(5);
		LocalDate date2 = LocalDate.parse("2020-02-13").plus(3, ChronoUnit.MONTHS);
		LocalTime time1 = LocalTime.parse("06:30").minusMinutes(30);
		LocalTime time2 = LocalTime.parse("06:30").minus(500, ChronoUnit.MILLIS);
		LocalDateTime dateTime1 = LocalDateTime.parse("2020-02-13T06:30").plus(Duration.ofHours(2));
		// using TemporalAdjusters, which implements a few useful cases:
		LocalDate date3 = LocalDate.parse("2020-02-13").with(TemporalAdjusters.lastDayOfMonth());
		
		System.out.println("date1:"+date1.toString());
		System.out.println("date2:"+date2.toString());
		System.out.println("date3:"+date3.toString());
		
		System.out.println("time1:"+time1.toString());
		System.out.println("time2:"+time2.toString());
		
		System.out.println("datetime1:"+dateTime1.toString());
	}
	
	static void test2()
	{
		LocalDateTime dateTime = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
		
		Date now = new Date();
		// represents 2018-02-28T23:24:43.106
		LocalDateTime dateTime2 = LocalDateTime.ofInstant(now.toInstant(), ZoneId.systemDefault());
		// represent Wed Feb 28 23:24:43 CET 2018
		Date date4 = Date.from(dateTime.toInstant(ZoneOffset.ofHours(1)));
		Date date5 = Date.from(dateTime.toInstant(ZoneId.systemDefault().getRules().getOffset(dateTime)));
		
		System.out.println("date4:"+date4.toString());
		System.out.println("date5:"+date5.toString());
		
		System.out.println("datetime2:"+dateTime2.toString());
	}
	
	static void test3()
	{
		Period period = Period.parse("P27D");
		
		Duration duration = Duration.between(LocalDateTime.parse("2018-01-18T06:30"), LocalDateTime.parse("2018-02-14T22:58"));
		
		OffsetDateTime offsetDateTime = LocalDateTime.parse("2018-02-14T06:30").atOffset(ZoneOffset.ofHours(2));
		
		ZonedDateTime zonedDateTime1 = LocalDateTime.parse("2018-02-14T06:30").atZone(ZoneId.of("Europe/Paris"));
		
		ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("2018-02-14T06:30+06:00[Asia/Macau]");
		
		System.out.println("period:"+period.toString());
		System.out.println("duration:"+duration.toString());
		System.out.println("offsetDateTime:"+offsetDateTime.toString());
		System.out.println("zonedDateTime1:"+zonedDateTime1.toString());
		System.out.println("zonedDateTime2:"+zonedDateTime2.toString());
	}
	
	static void test4()
	{
		// timeInMacau represents 2018-02-14T13:30+08:00[Asia/Macau]
		ZonedDateTime timeInIndia = LocalDateTime.parse( "2018-02-14T13:30" ).atZone( ZoneId.of( "Asia/Kolkata" ) );
		// timeInParis represents 2018-02-14T06:30+01:00[Europe/Paris]
		ZonedDateTime timeInParis = timeInIndia.withZoneSameInstant( ZoneId.of( "Europe/Paris" ) );
		OffsetDateTime offsetInMacau = LocalDateTime.parse( "2018-02-14T13:30" ).atOffset( ZoneOffset.ofHours( 8 ) );
		OffsetDateTime offsetInParis = offsetInMacau.withOffsetSameInstant( ZoneOffset.ofHours( 1 ) );
		
		System.out.println("timeInIndia:"+timeInIndia.toString());
		System.out.println("timeInParis:"+timeInParis.toString());
		System.out.println("offsetInMacau:"+offsetInMacau.toString());
		System.out.println("offsetInParis:"+offsetInParis.toString());
	}
	
	static void formating()
	{

		// Let’s say we want to convert all of patterns mentioned above.
		// 09-23-2018, 23/09/2018 and 2018-09-23 should all convert to the same LocalDate.
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd/MM/yyyy][MM-dd-yyyy]");
		LocalDate.parse("09-23-2018", formatter1);
		LocalDate.parse("23/09/2018", formatter1);
		LocalDate.parse("2018-09-23", formatter1);
		
		DateTimeFormatter formatter2 = new DateTimeFormatterBuilder()
				.appendOptional( DateTimeFormatter.ofPattern( "yyyy-MM-dd" ) )
				.optionalStart().appendPattern( "dd/MM/yyyy" ).optionalEnd()
				.optionalStart().appendPattern( "MM-dd-yyyy" ).optionalEnd()
				.toFormatter();
	}
	
	static void locals()
	{
		Locale.getAvailableLocales();
	}

}
