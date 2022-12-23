package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEg2 
{
	public static void main(String[] args) {
		Deque <String> deque =new ArrayDeque<String>();
		deque.add("Shifa");
		deque.add("Nisha");
		deque.add("Eliza");
		deque.offerFirst("Falak");
		System.out.println("After Offer first "+deque);
		deque.offerLast("Sakshi");
		System.out.println("After offer last "+deque);
		//traversing
		for(String str : deque) {
			System.out.println(str);
			//deque.peek() & deque.peekFirst()-->same as peek()
		}
		System.out.println("peek : "+deque.peekLast());
		System.out.println("After peek last");
		for(String str1 : deque)  {
			System.out.println(str1);
		}
		//deque.poll() & deque.pollLast()--> same as poll()
			System.out.println("poll : "+deque.pollLast());
			System.out.println("After poll last ");
			for(String str :deque)  {
				System.out.println(str);
		}
	}	
}
