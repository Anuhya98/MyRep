package com.practise;
import java.util.Scanner;
public class Calculator 
{
  public static void main(String[] args)
  {
	int a,b,choice;
	System.out.println("Enter numbers");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Enter your choice between 1-4");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:System.out.println(""+(a+b));
	break;
	case 2:System.out.println(""+(a-b));
	break;
	case 3:System.out.println(""+(a*b));
	break;
	case 4:System.out.println(""+(a/b));
	break;
	default:System.out.println("Can u plz enter valid options");
	}
  }
}
