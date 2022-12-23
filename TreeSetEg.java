package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEg 
{
	public static void main(String[] args) {
		// creating & adding elements
		TreeSet<String> set = new TreeSet<String>(); // creating tree set
		set.add("A");
		set.add("N");
		set.add("D");
		set.add("P");
		set.add("Q");
		set.add("S");
		set.add("T");
		set.add("J");
		set.add("F");
		set.add("G");
		set.add("V");
		set.add("C");
		set.add("R");
		
		System.out.println("Orginal set : "+set);
		// Traversing elements through iterator  in descending
		Iterator itr = set.descendingIterator();
		while(itr.hasNext())  {
			System.out.println(itr.next());
		}
		System.out.println("Lowest Value : "+set.pollFirst());
		System.out.println("Updated set after PollFirst : "+set);
		System.out.println("Highest Value : "+set.pollLast());
		System.out.println("Updated set after PollLast : "+set);
		
		System.out.println("Reverse set : "+set.descendingSet());
		
		System.out.println("Head set : "+set.headSet("D")); //before D all alphabet present in the list
		System.out.println("Sub set : "+set.subSet("C", "N"));
		System.out.println("Tail set : "+set.tailSet("O")); //after O all the alphabet present in the list
	}
}
