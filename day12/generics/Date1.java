package com.cts.generics;

import java.time.LocalDate;
import java.time.Month;

public class Date1 
{
public static void main(String[] args) {
	LocalDate date=LocalDate.now();
	int day=date.getDayOfMonth();
	int year=date.getDayOfYear();
	Month month=date.getMonth();
	System.out.println("today date is "+date);
	System.out.println("Day of the month is "+day);
	System.out.println("Day of the year is "+year);
	System.out.println("Month is "+month);
	LocalDate day1=LocalDate.of(1998, 07, 18);
	System.out.println("Your required day is "+day1);
}
}
