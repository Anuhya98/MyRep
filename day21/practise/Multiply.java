package com.practise;
import java.util.Scanner;
public class Multiply
{
	public static void main(String[] args) 
	{
	  int i,limit, n;
	  System.out.println("Enter the number");
	  System.out.println("Enter the limit");
	  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  limit=sc.nextInt();
	  for(i=1;i<=limit;i++)
	  {
		int result=(n*i);
		System.out.println("The table is "+result);
	  }
	}

}
