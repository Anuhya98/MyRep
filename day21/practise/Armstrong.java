package com.practise;
import java.util.Scanner;
public class Armstrong
{
  public static void main(String[] args) 
  {
	int number,r,n,count=0;
	double sum=0;
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	number=sc.nextInt();
	int number1=number;
	while(number>0)
	{
		number=number/10;
		count++;
	}
	System.out.println("The number of digits in number are "+count);
	int digits=count;
	int  number2=number1;
	while(number1>0)
	{
	r=number1%10;
	number1=number1/10;
	sum=sum+Math.pow(r,digits);
  }
	if(sum==number2)
	System.out.println("The armstrong number is "+sum);
	else
		System.out.println("not armstrong");
  }
   
}
