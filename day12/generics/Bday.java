package com.cts.generics;

import java.time.LocalDate;
import java.time.MonthDay;

public class Bday
{
   public static void main(String[] args)
   {
	LocalDate today=LocalDate.now();
	LocalDate bday=LocalDate.of(1998, 7, 18);
	MonthDay birth=MonthDay.of(bday.getMonthValue(), bday.getDayOfMonth());
	MonthDay current=MonthDay.from(today);
	if(birth.equals(current))
	{
		System.out.println("They are same");
	}
	else
		System.out.println("Not same");
}

}
