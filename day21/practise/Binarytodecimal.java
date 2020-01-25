package com.practise;
import java.util.Scanner;
public class Binarytodecimal
{
public static void main(String[] args) 
 {
   int num,result;
   System.out.println("Enter the binary number");
   Scanner sc=new Scanner(System.in);
   num=sc.nextInt();
   result=btod(num);
   System.out.println("The decimal number is "+result);
 }

private static int btod(int num)
{
	int r,n=0,sum=0,i=0;
	while(num>0)
	{
	r=num%10;
	num=num/10;
	sum+=r*Math.pow(2,i);
	++i;
	}
	// TODO Auto-generated method stub
	return sum;
}
}
