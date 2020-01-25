package com.practise;
import java.util.Scanner;
public class Arrayavg 
{
	public static void main(String[] args)
	{
	    int a1[]=new int[5];
	    int sum=0,i;
	    System.out.println("Enter the no of values into the array");
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    System.out.println("Enter the values into an array");
	    for( i=0;i<n;i++)
	    {
	    	a1[i]=sc.nextInt();
	    }
	    for(i=0;i<n;i++)
	    {
	    	sum=sum+a1[i];
	    }
	    System.out.println("The sum of array elements is "+sum);
	}

}
