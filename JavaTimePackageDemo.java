package com.dnpass.corejavatraining.day11.DateAndTime;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.HijrahChronology;
import java.time.chrono.IsoChronology;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.MinguoChronology;
import java.time.chrono.ThaiBuddhistChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.IsoFields;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

public class JavaTimePackageDemo {

	public static void main(String[] args) {
	    
		System.out.printf("%s%n",DayOfWeek.MONDAY.plus(3));
		
		DayOfWeek dow=DayOfWeek.MONDAY;
		Locale locale=Locale.getDefault();
		System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
		System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));
		
		System.out.printf("%d%n",Month.FEBRUARY.maxLength());
		
		Month month=Month.AUGUST;
		locale=Locale.getDefault();
		System.out.println(month.getDisplayName(TextStyle.FULL, locale));
		System.out.println(month.getDisplayName(TextStyle.NARROW, locale));
		System.out.println(month.getDisplayName(TextStyle.SHORT, locale));
		
		
		LocalDate date=LocalDate.of(2000,Month.NOVEMBER,20);
		LocalDate nextwed=date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		
		DayOfWeek dotw=LocalDate.of(2012, Month.JULY,9).getDayOfWeek();
		
		
		
		date=LocalDate.of(2000, Month.NOVEMBER,20);
		TemporalAdjuster adj=TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
		nextwed=date.with(adj);
		System.out.printf("For the date of %s,the next wednesday is%s.%n",date,nextwed);
		
		
		YearMonth date4=YearMonth.now();
		System.out.printf("%s: %d%n",date4,date4.lengthOfMonth());
		
		YearMonth date2=YearMonth.of(2010,Month.FEBRUARY);
		System.out.printf("%s: %d%n",date2,date2.lengthOfMonth());
		
		YearMonth date3=YearMonth.of(2012,Month.NOVEMBER);
		System.out.printf("%s: %d%n",date2,date2.lengthOfMonth());
		
		
		
		
		MonthDay day5=MonthDay.of(Month.FEBRUARY,29);
		boolean validLeapYear=day5.isValidYear(2010);
		
		validLeapYear=Year.of(2012).isLeap();
		
		LocalTime thisSec;
		for(int i=0;i<10;i++) {
			thisSec=LocalTime.now();
			
			
			System.out.printf("%d:%d:%d",thisSec.getHour(),thisSec.getMinute(),thisSec.getSecond());
			
		}
		
		System.out.printf("now: %s%n",LocalDateTime.now());
		
		System.out.printf("Apr 15,1994 @ 11:30am: %s%n",LocalDateTime.of(1994, Month.APRIL,15,11,30));
		
		System.out.printf("now(from instant): %s%n",LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()));
		
		System.out.printf("6 months from now:%s%n",LocalDateTime.now().plusMonths(6));
		
		System.out.printf("6 months ago:%s%n",LocalDateTime.now().minusMonths(6));
		
		Set<String> allZones=ZoneId.getAvailableZoneIds();
		LocalDateTime dt=LocalDateTime.now();
		
		
		
		
		List<String> zoneList=new ArrayList<String>(allZones);
		Collections.sort(zoneList);
		
		for(String s:zoneList) {
			ZoneId zone=ZoneId.of(s);
			ZonedDateTime zdt=dt.atZone(zone);
			ZoneOffset offset=zdt.getOffset();
			int secondsHour=offset.getTotalSeconds()%(60*60);
			String out=String.format("%35s %10s%n",zone,offset);
			
			
			if(secondsHour !=0) {
				System.out.printf(out);
			}
			
			
		}
		
		
		
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("MMMM d yyyy hh:mm a");
	
		LocalDateTime leaving=LocalDateTime.of(2013, Month.JULY,20,19,30);
		ZoneId leavingZone=ZoneId.of("America/los angels");
		ZonedDateTime departure=ZonedDateTime.of(leaving,leavingZone);
		try {
			String out1=departure.format(format);
			System.out.printf("LEAVING: %s(%s)%n",out1,leavingZone);
		}catch (DateTimeException exc) {
			System.err.printf("%s can't be formatted!%n",departure);
			throw exc;
		}
		
		
		ZoneId arrivingZone=ZoneId.of("Asia/Tokyo");
		ZonedDateTime arrival=departure.withZoneSameInstant(arrivingZone).plusMinutes(650);
		try {
			String out1=arrival.format(format);
			System.out.printf("ARRIVING: %s(%s)%n",out1,arrivingZone);
		}catch (DateTimeException exc) {
			System.err.printf("%s can't be formatted!%n",arrival);
		}
		
		
		if(arrivingZone.getRules().isDaylightSavings(arrival.toInstant())) {
		    System.out.printf(" (%s daylight saving time will be in effect.)%n",arrivingZone);
		}
		else
		    System.out.printf(" (%s standard time will be effect.)%n",arrivingZone);	
		
		
		
		LocalDateTime localDate=LocalDateTime.of(2013,Month.JULY,20,19,30);
		ZoneOffset offset=ZoneOffset.of("-08:00");
		
		OffsetDateTime offsetDate=OffsetDateTime.of(localDate, offset);
		OffsetDateTime lastThursday=offsetDate.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
		System.out.printf("the last thursday in july 13 is the %sth.%n",lastThursday.getDayOfMonth());
		
		
		Instant timestamp=Instant.now();
		
		Instant oneHourLater=Instant.now().plus(1,ChronoUnit.HOURS);
		
		
		
		long secondsFromEpoch=Instant.ofEpochSecond(0L).until(Instant.now(),ChronoUnit.SECONDS);
		LocalDateTime ldt=LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
		System.out.printf("%s %d %d:%d%n",ldt.getMonth(),ldt.getDayOfMonth(),ldt.getYear(),ldt.getHour(),ldt.getMinute());
		
		
		
		String in="19590709";
		LocalDate date11=LocalDate.parse(in,DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(date11);
		
		String input="jan 3 2003";
		try {
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM d yyyy");
			LocalDate date12=LocalDate.parse(input,formatter);
			System.out.printf("%s%n",date12);
			
			input="Mar 23 1994";
			date12=LocalDate.parse(input,formatter);
			System.out.printf("%s%n",date12);
			
			formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
			input="jun 3 2003";
			
			date12=LocalDate.parse(input,formatter);
			System.out.printf("%s%n",date12);	
			
		}catch (DateTimeParseException exc) {
			System.out.printf("%s is not parsable!%n",input);
			throw exc;
			
		}
		
		format=DateTimeFormatter.ofPattern("MMM d yyyy hh:mm a");
		String out1=departure.format(format);
		System.out.printf("LEAVING: %s (%s)%n",out1,leavingZone);
		String out2=arrival.format(format);
		System.out.printf("ARRIVING: %s (%s)%n",out2,arrivingZone);
		
		boolean isSupported=LocalDate.now().isSupported(ChronoField.CLOCK_HOUR_OF_DAY);
		
		LocalTime.now().get(ChronoField.MILLI_OF_SECOND);
		int qoy=date.get(IsoFields.QUARTER_OF_YEAR);
		
		Instant instant=Instant.now();
		isSupported=instant.isSupported(ChronoUnit.DAYS);
		
		
		date=LocalDate.of(2000,Month.OCTOBER,15);
		dotw=date.getDayOfWeek();
	    System.out.printf("%s is on a %s%n",date,dotw);
	    
	    
	    System.out.printf("first day of the month: %s%n",date.with(TemporalAdjusters.firstDayOfMonth()));
	    System.out.printf("first monday of the month: %s%n",date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
	    System.out.printf("last day of the month: %s%n",date.with(TemporalAdjusters.lastDayOfMonth()));
	    System.out.printf("first day of the next month: %s%n",date.with(TemporalAdjusters.firstDayOfNextMonth()));
	    System.out.printf("first day of next year: %s%n",date.with(TemporalAdjusters.firstDayOfNextYear()));
	    
	    TemporalQuery<TemporalUnit> query=TemporalQueries.precision();
	    System.out.printf("LocalDate precision is %s%n",LocalDate.now().query(query));
	    System.out.printf("LocalDateTime precision is %s%n",LocalDateTime.now().query(query));
	    System.out.printf("year precision is %s%n",Year.now().query(query));
	    System.out.printf("YearMonth precision is %s%n",YearMonth.now().query(query));
	    System.out.printf("Instant precision is %s%n",Instant.now().query(query));
	    
	    
	   Boolean isFamilyVacation=date.query(new FamilyVacations());
	    
	    
	   Boolean isFamilyBirthday=date.query(FamilyBirthdays::isFamilyBirthday);
	    
	   if(isFamilyVacation.booleanValue()||isFamilyBirthday.booleanValue())
	       System.out.printf("is an important date!%n",date);
	   else
	    	System.out.printf("is not a important date.%n",date);
	    
	    String day[]= {"",""};
	 
	    
	    Instant previous=Instant.now();
	    
	    long ns=Duration.between(Instant.now(),Instant.now()).toNanos();
	    
	    Instant start=Instant.now();
	    Duration gap=Duration.ofSeconds(10);
	    Instant later=start.plus(gap);
	    
	    Instant current=Instant.now();
	    if(previous!=null) {
	    	long gapL=ChronoUnit.MILLIS.between(previous, current);
	    }
	    
	    LocalDate today=LocalDate.now();
	    LocalDate birthday=LocalDate.of(1960, Month.JANUARY,1);
	    
	    Period p=Period.between(birthday,today);
	    long p2=ChronoUnit.DAYS.between(birthday,today);
	    System.out.println("you are"+p.getYears()+"years,"+p.getMonths()+"months,"+p.getDays()+"days old.("+p2+"days total)");
	    
	    today=LocalDate.now();
	    birthday=LocalDate.of(1960,Month.JANUARY,1);
	    
	    LocalDate nextBDay=birthday.withYear(today.getYear());
	    
	    
	    if(nextBDay.isBefore(today)||nextBDay.isEqual(nextBDay)) {
	    	nextBDay=nextBDay.plusYears(1);
	    }
	    
	   p=Period.between(today, nextBDay);
	   p2=ChronoUnit.DAYS.between(birthday, nextBDay);
	   System.out.println("there are "+p.getMonths()+"Months,and "+p.getDays()
	   +"days until your next birthday.("+ p2 +"total)");
	   
	   date=LocalDate.of(1996,Month.OCTOBER,29);
	  System.out.printf("%s%n", JavaTimePackageDemo.toString(date,JapaneseChronology.INSTANCE));
	   System.out.printf("%s%n", JavaTimePackageDemo.toString(date,MinguoChronology.INSTANCE));
	   System.out.printf("%s%n", JavaTimePackageDemo.toString(date,ThaiBuddhistChronology.INSTANCE));
	   System.out.printf("%s%n", JavaTimePackageDemo.toString(date,HijrahChronology.INSTANCE));
	   
	   System.out.printf("%s%n", JavaTimePackageDemo.fromString("10/29/0008 H",JapaneseChronology.INSTANCE));
	   System.out.printf("%s%n", JavaTimePackageDemo.fromString("10/29/0085 1",MinguoChronology.INSTANCE));
	   System.out.printf("%s%n", JavaTimePackageDemo.fromString("10/29/2539 B.E.",ThaiBuddhistChronology.INSTANCE));
       System.out.printf("%s%n", JavaTimePackageDemo.fromString("6/16/1417 1",HijrahChronology.INSTANCE));
	   
	   Calendar now=Calendar.getInstance();
	   ZonedDateTime zdt=ZonedDateTime.ofInstant(now.toInstant(), ZoneId.systemDefault());
	   
	   GregorianCalendar cal=(GregorianCalendar) Calendar.getInstance();
	   TimeZone tz=cal.getTimeZone();
	   int tzoffset=cal.get(Calendar.ZONE_OFFSET);
	   
	   zdt=cal.toZonedDateTime();
	   
	   GregorianCalendar newCal=GregorianCalendar.from(zdt);
	  
	   ldt=zdt.toLocalDateTime();
	   date=zdt.toLocalDate();
	   LocalTime time=zdt.toLocalTime();
	}
	public static String toString(LocalDate localDate,Chronology chrono) {
		if(localDate!=null) {
			Locale locale=Locale.getDefault(Locale.Category.FORMAT);
			ChronoLocalDate cDate;
			if(chrono==null) {
				chrono=IsoChronology.INSTANCE;
			}
			try {
				cDate=chrono.date(localDate);
			}catch (DateTimeException ex) {
				System.err.println(ex);
				chrono=IsoChronology.INSTANCE;
				cDate=localDate;
			}
			DateTimeFormatter dateFormatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale)
					.withChronology(chrono).withDecimalStyle(DecimalStyle.of(locale));
			String pattern="M/d/yyyy GGGG";
			return dateFormatter.format(cDate);		
	}else {
		return "";
	}
}

public static LocalDate fromString(String text,Chronology chrono) {
	if(text!=null&&!text.isEmpty()) {
		Locale locale=Locale.getDefault(Locale.Category.FORMAT);
		if(chrono==null) {
			chrono=IsoChronology.INSTANCE;
		}
		String pattern="M/d/yyyy GGGG";
		DateTimeFormatter df=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale)
				.withChronology(chrono).withDecimalStyle(DecimalStyle.of(locale));
		TemporalAccessor temporal=df.parse(text);
		ChronoLocalDate cDate=chrono.date(temporal);
		return LocalDate.from(cDate);	
	}
	return null;
}
	
}

class FamilyVacations implements TemporalQuery<Boolean> {
	
	public Boolean queryForm1(TemporalAccessor date) {
		int month=date.get(ChronoField.MONTH_OF_YEAR);
		int day=date.get(ChronoField.DAY_OF_MONTH);
		
		
		if((month==Month.APRIL.getValue())&&((day>=3) && (day<=8)))
			return  Boolean.TRUE;
		if((month==Month.AUGUST.getValue())&&((day>=8) && (day<=14)))
			return  Boolean.TRUE;
		
		return Boolean.FALSE;	
		
	}

	@Override
	public Boolean queryFrom(TemporalAccessor temporal) {
		
		return null;
	}
	
}

class FamilyBirthdays {
	
	public static Boolean isFamilyBirthday(TemporalAccessor date) {
		int month=date.get(ChronoField.MONTH_OF_YEAR);
		int day=date.get(ChronoField.DAY_OF_MONTH);
		
		
		if((month==Month.APRIL.getValue())&&(day==3))
			return  Boolean.TRUE;
		if((month==Month.AUGUST.getValue())&&(day==18))
			return  Boolean.TRUE;
		
		return Boolean.FALSE;	
		
	}	
	
}

class PaydayAdjuster implements TemporalAdjuster {
	
	public Temporal adjustInto(Temporal input) {
		LocalDate date=LocalDate.from(input);
		int day;
		if(date.getDayOfMonth()<15) {
			day=15;
		}else {
			day=date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
		}
		date=date.withDayOfMonth(day);
		if(date.getDayOfWeek()==DayOfWeek.SATURDAY||date.getDayOfWeek()==DayOfWeek.SUNDAY) {
			date=date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
		}
		return input.with(date);	
	}
	
}


class NextPayDay {
	public static void nextPayDay(String[] args) {
		Month month=null;
		LocalDate date=null;
		DateTimeFormatter format;
		String out=null;
		if(args.length<2) {
			System.out.printf("usage: NextPayDay<month><day>%n");
			throw new IllegalArgumentException();
		}
		try {
			month=Month.valueOf(args[0].toUpperCase());
		}catch (IllegalArgumentException exc) {
			System.out.printf("%s is not a valid month.%n",args[0]);
			throw exc;
		}
		int day=Integer.parseInt(args[1]);
		try {
			date=Year.now().atMonth(month).atDay(day);	
		}catch (DateTimeException exc) {
			System.out.printf("%s %s is not a valid date.%n",month,day);
			throw exc;
		}
		LocalDate nextPayDay=date.with(new PaydayAdjuster());
		try {
			format=DateTimeFormatter.ofPattern("yyyy mmm d");
			out=date.format(format);
			System.out.printf("given the date: %s%n",out);
			out=nextPayDay.format(format);
			System.out.printf(" the next pay day: %s%n",out);
		}catch (DateTimeException exc) {
			System.out.printf("%s can't be formatted!n",out);
			throw exc;
		}
	}
}