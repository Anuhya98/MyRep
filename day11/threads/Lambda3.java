package com.cts.threads;

public class Lambda3
{
	public static void main(String[] args)
	{
		He h1=(a,b) -> a+b;
		System.out.println(h1.add(10, 20));
	}

}
interface He
{
	public int add(int a,int b);
}
