package com.practise;
import java.util.Scanner;
public class Factorialrecursion
{
  public static void main(String[] args)
  {
	int n,result;
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
	result=fact(n);
	System.out.println("The factorial of a number is "+result);
  }

private static int fact(int n) {
	if(n<=1)
		return n;
	else
		return n*fact(n-1);
		// TODO Auto-generated method stub
	
}
}
