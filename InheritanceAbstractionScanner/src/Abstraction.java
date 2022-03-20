

abstract class Employee
{
	void show()
	{
		System.out.println("Hello My name is Aman");
	}
}

class Salary extends Employee
{
	void show() 
	{
		System.out.println("My Salary is 45000");
	}
}
public class Abstraction 
{
	public static void main(String[] args)
	{
		Employee s = new Salary();
		s.show();
		

	}

}
