package com.practise;
import java.util.Scanner;
public class Quadraticroots
{
	public static void main(String[] args) 
	{
	  double a,b,c,det;
	  System.out.println("Enter the values");
	  Scanner sc=new Scanner(System.in);
	  a=sc.nextDouble();
	  b=sc.nextDouble();
	  c=sc.nextDouble();
	  det=(b*b)-4*a*c;
	  if(det>0)
	  {
		  double root1=(-b+(Math.sqrt(det)))/(2*a);
		  double root2=(-b-(Math.sqrt(det)))/(2*a);
	  }
	  if(det==0)
	  {
		 double root1=-b/(2*a);
		 double root2=-b/(2*a);
	  }
	  else
	  {
		  double ipart=Math.sqrt(det)/(2*a);
		  double rpart=-b/(2*a);
		  System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", rpart, ipart, rpart, ipart);

	  }
	}

}
