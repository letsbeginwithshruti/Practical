package collection;

import java.util.LinkedList;

public class LinkedListMethod 
{
		public static void main(String[] args) {
			LinkedList<String> l1= new LinkedList<String>(); //creating list 1
			l1.add("Misbah");
			l1.add("Abhishek");
			l1.add("Atif");
			l1.add("Niladri");
			l1.add("Soumya");
			l1.add("Sourav");
			System.out.println("List 1 elements : "+l1);
			//Retrieves the first element of the list--> by default
			System.out.println("Retrieved first element: "+l1.peek());
			//Retrieves the 1st elements of the list
			System.out.println("Retrieved 1st  element : "+l1.peekFirst());
			//Retrieve the last element of the list
			System.out.println("Retrieved last element : "+l1.peekLast());
			//Retrieve and remove the first element of the list
			System.out.println("List 1 elements :  "+" "+l1.poll());
			//Retrieves the first element of the list
			System.out.println("List 1 elements : "+" "+l1.pollFirst());
			///Retrieves the last element of the list
			System.out.println("List 1 elements : "+l1.pollLast());
			//Retrieve and remove 1st element by default using pop() method
			System.out.println("New List 1 element : "+l1.pop());
	}
}
