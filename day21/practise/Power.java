package com.practise;
import java.util.Scanner;
public class Power
{
  public static void main(String[] args) 
  {
	 int num,power,result=1;
	 System.out.println("Enter the num and power");
	 Scanner sc=new Scanner(System.in);
	 num=sc.nextInt();
	 power=sc.nextInt();
	 while(power>0)
	 {
		 result=result*num;
		 --power;
	 }
	 System.out.println("The result is "+result);
}
}
