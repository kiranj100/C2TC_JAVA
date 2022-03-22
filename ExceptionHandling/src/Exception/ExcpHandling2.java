package Exception;

public class ExcpHandling2
{
	public static void main(String[] args)
	{
		int i[] = new int[5];
		i[3] = 32+8;
		i[4]= 40-6;
		try
		{
		i[6] = 30+2;
//		System.out.println(i);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
