package com.practise;
import java.util.Scanner;
public class Asciidynamic 
{
	public static void main(String[] args) 
	{
	  char ch;
	  System.out.println("Enter the character");
	  Scanner sc=new Scanner(System.in);
	  ch=sc.next().charAt(0);
	  int result=ch;
	  System.out.println("The ascii value of "+ch+"is "+result);
	}

}
