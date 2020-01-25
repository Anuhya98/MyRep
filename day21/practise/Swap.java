package com.practise;
import java.util.Scanner;
public class Swap
{
	public static void main(String[] args) 
	{
	   int a,b;
	   System.out.println("Enter the numbers to be swaped");
	   Scanner sc=new Scanner(System.in);
	   a=sc.nextInt();
	   b=sc.nextInt();
	   a=a+b;
	   b=a-b;
	   a=a-b;
	   System.out.println("The numbers after swapping are " +a+" and "+b);
	}
	

}
