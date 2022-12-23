package collection;

import java.util.LinkedHashSet;

public class LinkedHashsetEg 
{
	public static void main(String[] args) {
		//creating hashSet and adding elements
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Two");
		lhs.add("One");
		lhs.add("Three");
		lhs.add("Four");
		lhs.add("Five");
		System.out.println("Original List : "+lhs);
		// removing specific element from the above mentioned list
		System.out.println(lhs.remove("Two"));
		System.out.println("Updated list : "+lhs);
		//six is not present
		//returns false
		System.out.println(lhs.remove("Six"));
		
	}
}
