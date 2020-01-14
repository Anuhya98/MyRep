package com.cts.threads;

public class Threadrunnable
{
	public static void main(String[] args) 
	{
		System.out.println("Main thread");
		Thread t=Thread.currentThread();
		t.setPriority(Thread.MAX_PRIORITY-2);
		Runnable ft = () ->{
			for(int i=1;i<=10;i++)
			{
				if((i%2)!=0)
				{
				System.out.println("First thread :"+i);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable st=() ->{
			for(int i=1;i<=10;i++)
			{
				if(i%2==0) {
				System.out.println("Second thread :"+i);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread threadOne=new Thread(ft);
		Thread threadTwo=new Thread(st);
		threadTwo.setPriority(Thread.MIN_PRIORITY+2);
		threadOne.start();
		threadTwo.start();
			System.out.println("First thread priority :"+threadOne.getPriority());
			System.out.println("Second thread priority :"+threadTwo.getPriority());
	}

}
class FirstThreads implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if((i%2)!=0)
			{
			System.out.println("First thread :"+i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
//Even values
class SecondThreads implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0) {
			System.out.println("Second thread :"+i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

