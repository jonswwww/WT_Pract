import java.util.*;
class mth extends Thread
{
	mth(String s)
	{
		super(s);
	}	
	public void run()
	{
		System.out.println(getName()+"thread is created");
		while(true)
		{
			System.out.println(this);
			int s=(int)(Math.random()*5000);
			System.out.println(getName()+"is sleeping for:"+s+"msec");
			try
			{
				Thread.sleep(s);
			}catch(Exception e)
				{
					
				}
		}
	}
}
class slip13
{
	public static void main(String arg[])
	{
		mth t1=new mth("ABC");
		mth t2=new mth("PQR");
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}catch(Exception e)
		{}
		System.out.println(t1.getName()+"Thread Dead");
		System.out.println(t2.getName()+"Thread Dead");
	}
}