package com.dnpass.corejavatraining.day11.DateAndTime;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class TimeDateDemo {

	public static void main(String[] args) {
		
		
		LocalDate l_date=LocalDate.now();
		System.out.println("current time:"+l_date);
		
		LocalTime l_time=LocalTime.now();
		System.out.println(("current time:"+l_time));
		
		YearMonth ym=YearMonth.of(2016, 9);
		System.out.println(ym);
		
		String firstDay=ym.atDay(1).getDayOfWeek().name();
		String lastDay=ym.atEndOfMonth().getDayOfWeek().name();
		System.out.println();
		System.out.println(firstDay);
		System.out.println(lastDay);
		System.out.println();
		
		LocalTime time=LocalTime.now();
		System.out.println();
		//in hour,minute,seconds,nano seconds
		System.out.println("Local time now:"+time);
		
		time=LocalTime.now();
		System.out.println(time);
		
		LocalTime newTime=time.plusHours(4);
		System.out.println();
		System.out.println("Time after 4 hours:"+newTime);
		
		
		LocalDate today=LocalDate.now();
		LocalDate userday=LocalDate.of(2015,Month.MAY,15);
		Period diff=Period.between(userday, today);
		System.out.println("\ndifference between"+userday+"and"+today+":"
				+diff.getYears()+" year(s) and"+diff.getMonths()+"Month(s)\n");
		
		Instant timestamp=Instant.now();
		System.out.println("\ncurrent Timestamp:"+timestamp);
		
		today=LocalDate.now();
		System.out.println("\ncurrent date:"+today);
		System.out.println("10 days before today will be"+today.plusDays(-10));
		System.out.println("10 days after today will be"+today.plusDays(10)+"\n");
		
		today=LocalDate.now();
		LocalDate lastDayOfYear=today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println(lastDayOfYear);
		Period period=today.until(lastDayOfYear);
		System.out.println(period);
		System.out.println();
		System.out.println("months remaining in the year"+period.getMonths());
		
		
		
		Year yr=Year.now();
		
		System.out.println("\ncurrent year"+yr);
		boolean isLeap=yr.isLeap();
		System.out.println("Is current year leap year:"+isLeap);
		int length=yr.length();
		System.out.println("Length of the year:"+length+"days\n");
		
		
		
		LocalDate ldt=LocalDate.of(2016,Month.FEBRUARY,10);
		Month mn=ldt.getMonth();
		int minIntValue=mn.getValue();
		int minLength=mn.minLength();
		int maxLength=mn.maxLength();
		Month firstMonthOfQuarter=mn.firstMonthOfQuarter();
		System.out.println("\nInteger value of the current month:"+minIntValue);
		System.out.println("minimum Length of the month:"+minLength);
		System.out.println("Maximum length of the month:"+maxLength);
		System.out.println("First month of the Quarter:"+firstMonthOfQuarter);
		
		
		time=LocalTime.of(12, 24,32);
		int hour=time.getHour();
		int minute=time.getMinute();
		int second=time.getSecond();
		System.out.println("\ncurrent local time:"+time);
		System.out.println("hour:"+hour);
		System.out.println("minute:"+minute);
		System.out.println("second:"+second+"\n");
		
		
	
		LocalDateTime dateTime=LocalDateTime.now().minusHours(5).minusMinutes(30);
		System.out.println("\ncurrent date ad time:"+LocalDateTime.now());
		System.out.println("before 5 hours 30 minuts:"+dateTime);
		
		String string="May 1,2016";
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMMM d,yyyy",Locale.ENGLISH);
		LocalDate date=LocalDate.parse(string, formatter);
		System.out.println();
		System.out.println(date);
	    System.out.println();
	    
	    
	    LocalDate pdate=LocalDate.of(2012,01,01);
	    LocalDate now=LocalDate.now();
	    
	    diff=Period.between(pdate,now);
	    System.out.printf("\n difference is %d years,%d months and %d days old\n\n",diff.getYears(),diff.getMonths(),diff.getDays());
	    
	    dateTime=LocalDateTime.of(2016,9,16,0,0);
	    LocalDateTime dateTime2=LocalDateTime.now();
	    int diffIntNano=java.time.Duration.between(dateTime, dateTime2).getNano();
	    long diffInSeconds=java.time.Duration.between(dateTime, dateTime2).getSeconds();
	    long diffInMilli=java.time.Duration.between(dateTime, dateTime2).toMillis();
	    long diffInMinutes=java.time.Duration.between(dateTime, dateTime2).toMinutes();
	    long diffInHours=java.time.Duration.between(dateTime, dateTime2).toHours();
	    System.out.printf("\ndifference is %d hours,%d minutes,%d Milli,%d seconds and %d Nano\n\n",
	    		diffInHours,diffInMinutes,diffInMilli,diffInSeconds,diffIntNano);
	    
	    
	   
	    pdate=LocalDate.of(1989, 04, 11);
	   
	    diff=Period.between(pdate,now);
	    System.out.printf("\nI am %d years,%d months and %d days old.\n\n",diff.getYears(),diff.getMonths(),diff.getDays());
	    
	    LocalDate dt=LocalDate.now();
	    System.out.println("\nNext Friday:"+dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
	    System.out.println("previous Friday:"+dt.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY))+"\n");
	    
		
		
		
		
		
		

	}

}