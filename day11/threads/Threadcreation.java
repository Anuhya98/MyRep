package com.cts.threads;

public class Threadcreation 
{
	public static void main(String[] args)
	{
		System.out.println("Main thread");
		Firstthread ft=new Firstthread();
		ft.start();//It will call the run
		Secondthread st=new Secondthread();
		st.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main thread :"+i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
class Firstthread extends Thread
{
	@Override
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
class Secondthread extends Thread
{
	@Override
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
