package com.cts.generics;

import java.util.Date;

public class DateDemo
{
	public static void main(String[] args)
	{
		Date date=new Date();
		int day=date.getDay();
	    switch(day)
	    {
	    case 0:System.out.println("Sunday");
	    break;
	    case 1:System.out.println("Monday");
	    break;
	    case 2:System.out.println("Tuesday");
	    break;
	    case 3:System.out.println("Wednesday");
	    break;
	    case 4:System.out.println("Thursday");
	    break;
	    case 5:System.out.println("Friday");
	    break;
	    case 6:System.out.println("Saturday");
	    break;
	   default:System.out.println("Enter coorect input");
	   
	    }
	}
}
