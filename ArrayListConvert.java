package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvert 
{
	public static void main(String[] args) {
		// List al1 = new ArrayList();  //non-geneic
		List<String >a1 = new ArrayList<String>(); //creating an ArrayList
		a1.add("Rose");
		a1.add("Sunfllower");
		a1.add("Lily");
		a1.add("Daisy");
		a1.add("Marigold");
		a1.add("Tulip");
		a1.add("Jasmine");
		//conversion of list to array
		System.out.println("List to Array");
		String [] arr= a1.toArray(new String [a1.size()]);
		for(String s : arr)  {
			System.out.println(s);
		}
		//array to list
		System.out.println("Array to List");
		List <String>al1 = new ArrayList<String>();
		al1 =Arrays.asList(arr);
		System.out.println(al1);
	}
}
