package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg2
{
	public static void main(String[] args) {
		LinkedList<String> l1= new LinkedList<String>(); //creating list 1
		l1.add("Misbah");
		l1.add("Abhishek");
		l1.add("Atif");
		l1.add("Niladri");
		l1.add("Soumya");
		l1.add("Sourav");
		System.out.println(l1);
		LinkedList<String> l2=new LinkedList<String>(); //Create list 2
		l2.add("Peso");
		l2.add("Shifa");
		l2.add("Elijah");
		System.out.println("List 2 elements : "+l2);
		//Adding new element to the list 1
		l1.addAll(l2);
		System.out.println("After adding new elements : "+l1);
		//Removing specific element from arraylist 1
		l1.remove("Niladri");
		System.out.println("After removing : "+" "+l1);
		//Removing specific element on the basis of particular position
		l1.remove(1);
		System.out.println("After removing from specific position : "+" "+l1);
		//remove all the elements of list 2
		l1.removeAll(l2);
		System.out.println("After removing all new elements : "+" "+l1);
		//remove first element from the list
		l1.removeFirst();
		System.out.println("After removing first element : "+" "+l1);
		//remove last element of list 1
		l1.removeLast();
		System.out.println("Afte rremovng the last element : "+" "+l1);
		//Adding new elements to list 1
		l1.add("Pallabi");
		l1.add("Anudip");
		l1.add("Java");
		l1.add("Pallabi");
		l1.add("Collection");
		System.out.println("Updated list elements : "+l1);
		//remove first occurrence of element
		l1.removeFirstOccurrence("Pallabi");
		System.out.println("Removng first Occurrene : "+" "+l1);
		//remove last occurrence of element
		l1.removeLastOccurrence("Pallabi");
		System.out.println("Removing last occurrence : "+" "+l1);
		//Traversing the list of elements in reverse order
		Iterator i =l1.descendingIterator();
		while(i.hasNext())  {
			System.out.println(i.next());
			//remove all elements
			l1.clear();
			Iterator <String> it= l1.iterator();
			while(it.hasNext())  {
				System.out.println(it.next());
			}
		}
	}
}
