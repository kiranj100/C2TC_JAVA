package HiFine;

class Fine2{
	final void Display()
	{
		System.out.println("Hello My Name is Final");
	}
}


public class Fine1 extends Fine2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fine1 f = new Fine1();
		f.Display();
	}

}
