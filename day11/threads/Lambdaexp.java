package com.cts.threads;

public class Lambdaexp 
{
	public static void main(String[] args) 
	{
		Hello h=() -> {
			System.out.println("This is lambda expression");
			System.out.println("This is its use");
		};
		h.display();
	}

}
interface Hello
{
	public void display();
}