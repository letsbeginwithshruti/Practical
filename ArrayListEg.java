package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg 
{
	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();// declaring ArrayList using List
		//method add() --> we can add the element in the list
		a1.add("Rose");
		a1.add("Sunflower");
		a1.add("Rose");
		a1.add(0,"Lily"); // we can add element i any specified index also
		a1.add(2,"Daisy");
		a1.add("Marigold"); // a b c d e f g
		a1.add(6,"Tulip");
		a1.add("Jasmine");
		a1.add("Orchid");
		a1.add("Lotus");
		a1.add(5,"Lavender");
		a1.add("Shifa");  // Add element at the end of the list
		System.out.println(a1);
		// define the no. of elements using size()
		System.err.println("Size of the array List : "+a1.size());
		// specific element of given index using get()
		System.out.println("Element of index value is: "+a1.get(6));
		// remove any element from list using remove
		a1.remove(6);
		System.out.println(a1);
		System.err.println("Size of array List :" +a1.size());

	}
}
