package MultiThreadUsingExtends;


class Demo1 extends Thread
{
public	void run()
	{
		System.out.println("Id of Chrome "+ Thread.currentThread().getId());
	}
}
class Demo2 extends Thread
{
public	void run()
	 {
		System.out.println("Id of Eclipse " + Thread.currentThread().getId());
	 }
}
 class Demo3 extends Thread
{
public	void run()
	{
		System.out.println("Id of Text Editor " + Thread.currentThread().getId() );
	}
}
public class DemoMultiThread {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.start();	
		
		Demo2 d2 = new Demo2();
		d2.start();		
		
		Demo3 d3 = new Demo3();
		d3.start();		

		


	}

}

