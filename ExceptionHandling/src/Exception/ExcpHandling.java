package Exception;

public class ExcpHandling 
{
	public static void main(String[] args) 
	{
		
		int a[] = new int[5];
		a[2] = 20/2;
		a[3] = 50/25;
		
		try
		{
		
			a[4] = 30/0;
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
