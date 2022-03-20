import java.io.*;

public class Reader {

	public static void main(String[] args) throws IOException
{
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);		
		
		System.out.println("Enter The Your Name");
		String s = br.readLine();
		System.out.println("Your Name is " + s);
		
		

	}

}
