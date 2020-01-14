package com.cts.threads;

public class Thread1
{
	public static void main(String[] args)
	{
		Thread thread=Thread.currentThread();
		System.out.println(thread);
		thread.setName("Cts thread");
		System.out.println("Thread name :"+thread.getName());
		System.out.println("Is it a deamon thread?" +thread.isDaemon());
		System.out.println("Is the thread alive ?"+thread.isAlive());
		System.out.println("Thread state :"+thread.getState());
		System.out.println("thread id : "+thread.getId());
	}

}
