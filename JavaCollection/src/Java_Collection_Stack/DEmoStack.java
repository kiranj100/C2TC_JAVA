package Java_Collection_Stack;

import java.util.*;
public class DEmoStack {

	public static void main(String[] args) {
		
		Stack<Integer> stk = new Stack<>();
		
		stk.add(100);
		stk.add(200);
		stk.add(300);
		stk.add(400);
		stk.add(500);
		stk.add(600);
		System.out.println(stk);
		
		stk.pop();
		System.out.println(stk);
		
	}

}
