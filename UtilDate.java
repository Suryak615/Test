package com.dnpass.corejavatraining.day11.DateAndTime;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class UtilDate {

	public static void main(String[] args) {
		int year=2021;
		int month=0; 
		int date=1;
		
		Calendar cal=Calendar.getInstance();
		
		
		
		System.out.println();
		System.out.println("Year:"+cal.get(Calendar.YEAR));
		System.out.println("Month:"+cal.get(Calendar.MONTH));
		System.out.println("Date:"+cal.get(Calendar.DATE));
		System.out.println("Hour:"+cal.get(Calendar.HOUR));
		System.out.println("Minute:"+cal.get(Calendar.MINUTE));
		System.out.println();
		
		cal.clear();
		System.out.println();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, date);
		System.out.println(cal.getTime());
		
		cal=Calendar.getInstance();
		System.out.println();
		System.out.println("\ncurrent Date and time:"+ cal.getTime());
		int actualMaxYear=cal.getActualMaximum(Calendar.YEAR);
		int actualMaxMonth=cal.getActualMaximum(Calendar.MONTH);
		int actualMaxWeek=cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int actualMaxDate=cal.getActualMaximum(Calendar.DATE);
		
		System.out.println("Actual Maximum Year:"+actualMaxYear);
		System.out.println("Actual Maximum Month:"+actualMaxMonth);
		System.out.println("Actual Maximum week of Year:"+actualMaxWeek);
		System.out.println("Actual Maximum Date:"+actualMaxDate);
		System.out.println();
		
		System.out.println("\nCurrent Date and Time:"+cal.getTime());
		int actualMinYear=cal.getActualMinimum(Calendar.YEAR);
		int actualMinMonth=cal.getActualMinimum(Calendar.MONTH);
		int actualMinWeek=cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
		int actualMinDate=cal.getActualMinimum(Calendar.DATE);
		
		System.out.println("Actual Minimum Year:"+actualMinYear);
		System.out.println("Actual Minimum Month:"+actualMinMonth);
		System.out.println("Actual Minimum week of Year:"+actualMinWeek);
		System.out.println("Actual Minimum Date:"+actualMinDate);
		System.out.println();		
         
		Calendar calNewYork=Calendar.getInstance();
		calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println();
		System.out.println("Time in New York:"+calNewYork.get(Calendar.HOUR_OF_DAY)+":"+
				calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
		System.out.println();
		
		Calendar now=Calendar.getInstance();
		System.out.println();
		System.out.println("Current full date and time is:"+(now.get(Calendar.MONTH)+1)+"-"+now.get(Calendar.DATE)+"-"+now.get(Calendar.YEAR)+"-"+
		now.get(Calendar.HOUR_OF_DAY)+"-"+now.get(Calendar.MINUTE)+"-"+now.get(Calendar.SECOND)+"-"+now.get(Calendar.MILLISECOND));
		System.out.println();
		
		
		Calendar calender=Calendar.getInstance();
	    System.out.println();
	    System.out.println(calender.getActualMaximum(Calendar.DAY_OF_MONTH));
	    System.out.println();
	    
	    cal=Calendar.getInstance();
	    System.out.println();
	    cal.set(Calendar.DAY_OF_MONTH,cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	    System.out.println(cal.getTime());
	    System.out.println();
	    
	    cal=Calendar.getInstance();
	    int days=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	    System.out.println();
	    System.out.println("number of days of the current month:"+days);
	    
	   
	    
	    DateFormatSymbols symbols=new DateFormatSymbols(new Locale("de"));
	    
	    String[] dayNames=symbols.getWeekdays();
	    for(String s:dayNames) {
	    	System.out.println(s+"\n");
	    	System.out.println();
	    }
	   
	    int noOfDays=14;
	    cal=Calendar.getInstance();
	    Date cdate=cal.getTime();
	    cal.add(Calendar.DAY_OF_YEAR, noOfDays);
	    Date cdate1=cal.getTime();
	    System.out.println("\ncurrent date:"+cdate+"\n");
	    System.out.println("Day after Two weeks:"+cdate1+"\n");
	    
	    
	    cal=Calendar.getInstance();
	    cdate=cal.getTime();
	   
	    cal.add(Calendar.YEAR,1);
	    Date nyear=cal.getTime();
	    
	    cal.add(Calendar.YEAR,-2);
	    Date pyear=cal.getTime();
	    System.out.println("\ncurrent date:"+cdate);
        System.out.println("\nDate bfore 1 year:"+pyear);
        System.out.println("\nDate after 1 year:"+nyear+"\n");
        
        
        year=2016;
        System.out.println();
        if(year%400==0||year%4==0||year%100!=0) {
        	System.out.println("year"+year+"is a leap year");
        	
        }else
        	System.out.println("year"+year+"is not a leap year");
        
        cal=new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        System.out.println("\n"+cal.getTime()+"\n");
        
        try {
        	String originalString="2016-07-14 09:00:02";
        	Date date12=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(originalString);
        	String newstr=new SimpleDateFormat("MM/dd/yyyy,H:mm:ss").format(date12);
        	System.out.println("\n"+newstr+"\n"); 	
        }
        catch(ParseException e) {
        	e.printStackTrace();
        }
        
        
        long unix_seconds=137239860;
        
        Date date12=new Date(unix_seconds*1000L);
        
        SimpleDateFormat jdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        jdf.setTimeZone(TimeZone.getTimeZone("GMT-4"));
        String java_date=jdf.format(date12);
        System.out.println("\n"+java_date+"\n");
	}

}