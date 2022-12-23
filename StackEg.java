package collection;

import java.util.Stack;

public class StackEg 
{
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		// checking empty or not
		boolean result = s.empty();
		System.out.println("Is the stack empty ? " +result);
		// Adding element (push)
		s.push(25);
		s.push(35);
		s.push(40);
		s.push(55);
		s.push(80);
		s.push(75);
		//result
		System.out.println("Stack Element : "+s);
		Integer digit = s.peek(); //Access element from the top of the stack
		System.out.println("Top element : "+digit);
		System.out.println("Stack element after peek : "+s);
		Integer digit2 = s.pop();
		System.out.println("Top element : "+digit2);
		System.out.println("Stack element after pop : "+s);
		int digit1 = s.search(35); //search any element
		System.out.println("Search element after pop : "+digit1);
		int x = s.size(); //find the size of the stack
		System.out.println("Stack Size : "+x);
		result = s.empty(); //checking empty or not
		System.out.println("Is the stack empty ? "+result);
		
	}
}
