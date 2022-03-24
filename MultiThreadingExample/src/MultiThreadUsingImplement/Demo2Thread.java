package MultiThreadUsingImplement;

class Mul1 implements Runnable 
{
	public void run()
		{
			System.out.println("Id of Chrome " + Thread.currentThread().getId());
		}
	
	}
 
class Mul2 implements Runnable 
{
	public void run()
	{
		System.out.println("ID of Eclipse " + Thread.currentThread().getId());
	}
 
	
}

class Mul3 implements Runnable
{
	public void run()
	{
		System.out.println("Id of Text Editor " + Thread.currentThread().getId());
	}

}

public class Demo2Thread 
{
	public static void main(String[] args) 
	{
		Mul1  m1 = new Mul1();
		Thread t1 = new Thread(m1);
		t1.start();
		
		Mul2  m2 = new Mul2();
		Thread t2 = new Thread(m2);
		t2.start();
		
		Mul3  m3 = new Mul3();
		Thread t3 = new Thread(m3);
		t3.start();

	}

}
