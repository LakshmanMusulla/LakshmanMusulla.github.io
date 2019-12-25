package test;

import java.util.ListIterator;
import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		System.out.println(stack.search(10));
		System.out.println(stack.search(20));
		ListIterator<Integer> itr=stack.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
