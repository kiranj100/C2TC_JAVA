package HashSet;

import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		hs.add("java");
		hs.add("python");
		hs.add("PHP");
		hs.add("Ruby");
		hs.add("VB.Net");
		System.out.println(hs);
		
		hs.add("java");
		hs.add("Ruby");
		System.out.println(hs);
		
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
	}

}
