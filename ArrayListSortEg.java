package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortEg 
{
	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();// declaring ArrayList using List
		//method add() --> we can add the element in the list
		a1.add("Rose");
		a1.add("Sunflower");
		a1.add("Lily");
		a1.add("Daisy");
		a1.add("Marigold");
		a1.add("Tulip"); 
		a1.add("Jasmine");
		a1.add("Orchid");
		a1.add("Lotus");
		a1.add("Lavender");
		System.out.println("String sorted List: ");
		Collections.sort(a1);
		for( String a : a1) {
			System.out.println(a);
		}
		List<Integer> a2 = new ArrayList<Integer>();
		a2.add(20);
		a2.add(60);
		a2.add(20);
		a2.add(10);
		a2.add(67);
		a2.add(98);
		a2.add(5);
		
		System.out.println("Integer sorted list: ");
		Collections.sort(a2);
		for(int a3:a2) {
			System.out.println(a2);
		}
	}
}
