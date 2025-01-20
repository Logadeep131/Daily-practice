import java.util.*;

class Race implements Runnable
{
	private String name;
	private int startTime;
	private int endTime;
	

	Race(String name)
	{
	this.name=name;
	}

	public String getName()	{return this.name;}

	public String getStartTime() {return this.startTime;}

	public String getEndTime() {return this.endTime;}
	

	public void run()
	{
		this.startTime=
		
		for(int i=1;i<=20;i++)
		{
			try
			{
			     int sleepTime=Math.floor(Math.random()*10000);
		             Thread.sleep(sleepTime);
			     if(i==20)
				{
					this.endTime=
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public void WinnerList(Race Racer)
	{
		for(int i=0;i<Racer.length-1;i++)
		{
			for(int j=0;j<Racer.length;j++)
			{
			int val1=Racer[i].getEndTime()-Racer[i].getStartTime();
			int val2=Racer[i+1].getEndTime()-Racer[i+1].getStartTime();
			if(val1>val2)
			   {
				Racer obj=Racer[i];
				Racer[i]=Racer[i+1];
				Racer[i+1]=obj;
			   }
			}
		}
	}
	public void display(Racer Race)
	{
		for(int i=0;i<10;i++)
	       {
		int val=Racer[i].getEndTime()-Racer[i].getStartTime();		
		System.out.println("Racer Name : "+Racer[i].getName());
		System.out.println("Racer start time : "+Racer[i].getStartTime());
		System.out.println("Racer End time : "+Racer[i].getEndTime());
		System.out.println("Time taken : "+val);
	       }
	}

}

class BikeRacing extends Thread
{
	public static void main(String args[])
	{

	ThreadGroup tg = new ThreadGroup();

	Thread Racer[]= new Thread[10];
	
	for(int i=0;i<10;i++)
	{
		Racer[i]=new Thread(tg,Race());
	}

	for(int i=10;i>=0;i--)
	{
		try{
		System.out.println(i);
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
	System.out.println("Go");
	
	tg.start();
	tg.join();
	
	Race.WinnerList(Racer)
	Race.display();
	

	}

}
