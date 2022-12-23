package collection;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListMethod {
	public static void main(String[] args) {
		ArrayList <String>a1= new ArrayList<String>();
		a1.add("Shifa");
		a1.add("Nisha");
		a1.add("Sunny");
		a1.add("Eliza");
		a1.add("Sakshi");
		a1.add("Falak");
		String element = a1.get(2); //get()
		System.out.println("Get Index: "+element);
		System.out.println("Array List is : "+a1.isEmpty());
		String element1 = a1.remove(4);
		System.out.println("Remove Index : "+element1);
		System.out.println("Traversing using for loop");
		for( int i =0; i< a1.size(); i++) {
		System.out.println(a1.get(i));
	}
	}
}
