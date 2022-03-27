package MultiThreadPriorities;

class Prio1 implements Runnable
{
	public void run()
	{
		System.out.println("Id of Ubuontu-Store " + Thread.currentThread().getId());
	}
}

class Prio2 implements Runnable
{
	public void run()
	{
		System.out.println("Id Of Terminal " + Thread.currentThread().getId());
	}
}

class Prio3 implements Runnable
{
	public void run()
	{
		System.out.println("Id of Stacer "+ Thread.currentThread().getId());
		
	
	}
}
public class DemoPriority 
{
	public static void main(String[] args)
	{
		Prio1 p1 = new 	Prio1();
		Thread t1 = new Thread(p1);
			t1.setPriority(Thread.MIN_PRIORITY);
			t1.start();
			
		Prio2 p2 = new Prio2();
		Thread t2 = new Thread(p2);
			t2.setPriority(Thread.NORM_PRIORITY);
			t2.start();
			
		Prio3 p3 = new Prio3();
		Thread t3 = new Thread(p3);
			t3.setPriority(Thread.MAX_PRIORITY);
			t3.start();
	}

}

