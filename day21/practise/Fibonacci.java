package com.practise;
import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args)
	{
	  int f1=0,f2=1,f3 = 0,i,n;
	  System.out.println("Enter the number ");
	  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  System.out.println(f1);
	  System.out.println(f2);
	  for(i=2;i<=n;i++) 
	  {
		  f3=f1+f2;
		  f1=f2;
		  f2=f3;
	  System.out.println(f3);
	  }
	}

}
