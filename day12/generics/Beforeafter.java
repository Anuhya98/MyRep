package com.cts.generics;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Beforeafter 
{
	public static void main(String[] args) 
	{
		LocalDate today=LocalDate.now();
		LocalDate previous=today.minus(1,ChronoUnit.YEARS);
		LocalDate next=today.plus(1,ChronoUnit.YEARS);
		System.out.println("Today date is "+today);
		System.out.println("Before one year is "+previous);
		System.out.println("After one year is "+next);
	}

}
