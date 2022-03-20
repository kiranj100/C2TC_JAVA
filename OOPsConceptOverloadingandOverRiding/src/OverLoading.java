
class Overloading1
{
	void display(String s,int i)
	{
		System.out.println("The Person Name is " + s +"And His Id Number is " + i);
	}
	
	void display (int i)
	{
		System.out.println("His salary" + i);
	}
}


public class OverLoading {

	public static void main(String[] args) 
	{
		Overloading1 o = new Overloading1();
		o.display("Kiran", 21);
		o.display(34000);
	}

}
