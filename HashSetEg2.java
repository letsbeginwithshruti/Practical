package collection;

import java.util.HashSet;

public class HashSetEg2 	
{
	public static void main(String[] args) {
		//creating HashSet and adding elements 
		HashSet<String> set = new HashSet();  //set 1
		set.add("Shifa");
		set.add("Nisha");
		set.add("Falak");
		set.add("Eliza");
		set.add("Sakshi");
		System.out.println("Original list : "+set);
		// removing specific element from hash set
		set.remove("Shifa");
		System.out.println("After invoking remove : "+set);
		HashSet<String> set1 = new HashSet(); //set 2
		set1.add("Sanaya");
		set1.add("Neha");
		System.out.println("New Set : "+set1);
		set.addAll(set1);
		System.out.println("Updated list : "+set);
		//remove all the new elements 
		set.removeAll(set1);
		//remove all
		set.clear();
		System.out.println("Present list : "+set);
		
	
	}
}
