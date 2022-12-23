package collection;


import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueEg 
{
	public static void main(String[] args) {
		Deque<String>dq = new ArrayDeque<String>();
		dq.add("Sakshi");
		dq.add("Eliza");
		dq.add("Falak");
		dq.add("Shifa");
		dq.add("Nisha");
		dq.add("Anaya");
		System.out.println(dq);
		dq.addFirst("Sanaya");
		dq.addLast("Neha");
		System.out.println("New List");
		for(String s1 : dq) {
			System.out.println(s1);
		}
		dq.removeFirst();
		dq.removeLast();
		System.out.println("New list after Removal ");
		for(String s2: dq) {
			System.out.println(s2);
		}
		
	}
}
