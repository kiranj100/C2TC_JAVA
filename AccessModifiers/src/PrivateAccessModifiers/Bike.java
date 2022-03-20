package PrivateAccessModifiers;

class Car
{
	private void Display()
	{
		System.out.println("Hello My Name is Private");
	}
}


public class Bike {

	public static void main(String[] args) {
		Car c = new Car();
		c.Display();
	}

} // Error Messeage : - The method Display() from the type Car is not visible
