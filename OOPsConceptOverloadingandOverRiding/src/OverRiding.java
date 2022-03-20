

class OverRiding1 
{
	void Display()
	{
		System.out.println("How Are You ");
	}
}

class OverRiding2 extends OverRiding1
{
	void Display()
	{
		System.out.println("Yeah Fine");
	}
}

public class OverRiding 
 {
	public static void main(String[] args)
	 {
		OverRiding1 r1 = new OverRiding1();
		r1.Display();
		OverRiding1 r =  new OverRiding2() ;
		r.Display();
	 }

}
