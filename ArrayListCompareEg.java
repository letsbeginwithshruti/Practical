package collection;

import java.util.ArrayList;

public class ArrayListCompareEg 
{
	public static void main(String[] args) {
		ArrayList<String> all=new ArrayList<String>(); //creating array list
		all.add("Rose");
		all.add("Sunflower");
		all.add("Lily");
		all.add("Daisy");
		all.add("Marigold");
		all.add("Tulip");
		all.add("Jasmine");
		System.out.println(all);
		ArrayList<String> al1= new ArrayList<String>();
		al1.add("Rose");
		al1.add("Sunflower");
		al1.add("Lily");
		al1.add("Daisy");
		al1.add("Marigold");
		al1.add("Tulip");
		al1.add("Jasmine");
		System.out.println(al1);
		// compare array list
		boolean b= all.equals(al1);
		System.out.println(b);
		all.add("Red Rose");
		boolean b1= all.equals(al1);
		System.out.println(b1);
	}
}
