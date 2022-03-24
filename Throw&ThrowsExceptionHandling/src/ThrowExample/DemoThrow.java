package ThrowExample;

public class DemoThrow 
{
	static void Age(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("Not Eligibal for Voting");
		}
		else
		{
			System.out.println("You Are Eligibel for Voting");
		}
	}	
		public static void main(String[] args) {
		
		{
			Age(10);
		}
	}

}
