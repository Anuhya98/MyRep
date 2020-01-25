package com.practise;
import java.util.Scanner;
public class Leap
{
	public static void main(String[] args) 
	{
	   int year;
	   System.out.println("Enter the year");
	   Scanner sc=new Scanner(System.in);
	   year=sc.nextInt();
	   if(year%4==0)
	   {
	   System.out.println("Leap year");
	   }
	   else
	   {
		   System.out.println("Not");
	   }
	}

}
