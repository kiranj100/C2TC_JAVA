package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> arry = new ArrayList<String>();
	
		System.out.println("Simple Array List ");
		arry.add("Audi");
		arry.add("BWM");
		arry.add("Ford");
		arry.add("Honda");
		arry.add("Jaguar");
		arry.add("Ferrari");
		
		System.out.println(arry);
		arry.set(2,"Porsche");
		System.out.println(arry);
		arry.remove(3);
		System.out.println(arry +"\n");
		
		System.out.println("Using For Loop ");
		
	for(int i = 0 ; i < arry.size(); i++)
		{
			
			System.out.println(arry.get(i));
			
		} System.out.println();
	
	System.out.println("Using Advance For Loop");
	
	for(String s : arry)
	{
		System.out.println(s);
	}System.out.println();
	
	System.out.println("Using While Loop");
	 int ii = 0;
	while(ii < arry.size())
	{
		System.out.println(arry.get(ii));
		ii++;
	} System.out.println();
	
	System.out.println("Using Iterator");
	
	Iterator it = arry.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		
	}
}
