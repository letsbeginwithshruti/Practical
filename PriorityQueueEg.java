package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEg 
{
	public static void main(String[] args) {
		PriorityQueue<String>queue = new PriorityQueue<String>();
		queue.add("Shifa");
		queue.add("Nisha");
		queue.add("Eliza");
		queue.add("Falak");
		queue.add("Neha");
		queue.add("Sakshi");
		System.out.println("head : "+queue.element());
		System.out.println("Queue : "+queue);
		System.out.println("head : "+queue.peek());
		System.out.println("Queue : "+queue);
		System.out.println("Iterating the elements ");
		/*Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		System.out.println("head : "+queue.poll());
		System.out.println("Queue : "+queue);
		System.out.println("head : "+queue.remove());
		System.out.println("Queue : "+queue);
		System.out.println("After removing");
		/*Iterator <String > it =queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());  }*/
	}
}
