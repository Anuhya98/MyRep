package com.cts.threads;

public class Lambdaexp1
{
	public static void main(String[] args) 
	{
		Runnable r=() ->System.out.println("Runnable interface");
		Thread t=new Thread(r);
		t.start();
	}

}


