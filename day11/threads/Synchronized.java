package com.cts.threads;

public class Synchronized 
{
	public static void main(String[] args) 
	{
		System.out.println("Main thread");
		Resource resource=new Resource();
		//Thread t=Thread.currentThread();
		//t.setPriority(Thread.MAX_PRIORITY-2);
		
		FirstThreadsync fs=new FirstThreadsync(resource);
		SecondThreadsync ss=new SecondThreadsync(resource);
			
		Thread threadOne=new Thread(fs);
		Thread threadTwo=new Thread(ss);
		//threadTwo.setPriority(Thread.MIN_PRIORITY+2);
		threadOne.start();
		threadTwo.start();
//			System.out.println("First thread priority :"+threadOne.getPriority());
//			System.out.println("Second thread priority :"+threadTwo.getPriority());
	}

}
class FirstThreadsync implements Runnable
{
	Resource resource;
	public FirstThreadsync(Resource resource)
	{
		this.resource=resource;
	}
	@Override
	public void run()
	{
		resource.display("First Thread");
	}
		}
//Even values


class SecondThreadsync implements Runnable
{
	Resource resource;
	public SecondThreadsync(Resource resource)
	{
		this.resource=resource;
	}
	@Override
	public void run()
	{
		resource.display("Second Thread");
	}
	}
class Resource
{
	public synchronized void display(String message)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(message +":" +i);
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}