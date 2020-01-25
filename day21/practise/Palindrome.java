package com.practise;
import java.util.Scanner;
public class Palindrome
{
   public static void main(String[] args)
   {
	  int n,i,sum=0,r,n1;
	  System.out.println("Enter the number");
	  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  n1=n;
	  while(n>0)
	  {
		  r=n%10;
		  n=n/10;
		  sum=sum*10+r;
	  }
	  if(sum==n1)
	  {
		  System.out.println("Palindrome");
	  }
	  else
	  {
		  System.out.println("No");
	  }
   }
}
