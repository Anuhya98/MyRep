package com.practise;
import java.util.Scanner;
public class Checkalpha
{
	public static void main(String[] args)
	{
	  char ch;
	  System.out.println("Enter the alphabet");
	  Scanner sc=new Scanner(System.in);
	  ch=sc.next().charAt(0);
	  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	  {
		  System.out.println("Vowel");
	  }
	  else
	  {
		  System.out.println("Consonent");
	  }
	}

}
