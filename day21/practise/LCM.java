package com.practise;

import java.util.Scanner;

public class LCM 
{
	public static void main(String[] args)
	 {
		int n1,n2,lcm=1;
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		lcm=(n1>n2)?n1:n2;
		while(true)
		{
			if(lcm%n1==0 && lcm%n2==0)
			{
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
			++lcm;
		}
}
}
