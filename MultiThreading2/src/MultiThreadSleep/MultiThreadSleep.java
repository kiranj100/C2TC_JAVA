package MultiThreadSleep;

class Sleep1 implements Runnable
{
	public void run()
	{
		for (int i = 1; i <= 5; i++)
		 {	
			System.out.println("Id of Chrome "+ Thread.currentThread().getId());
		
			try 
				{
					Thread.sleep(1000);
				} 
			catch (InterruptedException e)
				{
					e.printStackTrace();
				}
	     }
	}
}
	


public class MultiThreadSleep
{
	public static void main(String[] args)
	{
		Sleep1 s = new Sleep1();
		Thread t = new Thread(s);
		t.start();
	}
}
