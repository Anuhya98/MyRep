package com.cts.generics;

import java.time.LocalDate;

public class Equaldates
{
	public static void main(String[] args) {
			LocalDate today=LocalDate.now();
			LocalDate birthday=LocalDate.of(1985, 01, 10);
			
			if(birthday.equals(today))
			{
				System.out.printf("Today %s and birthday %s are same dates %n",today,birthday);
			}
			else
			{
				System.out.println("Dates are not Equal");
			}
	}

}
