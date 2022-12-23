package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEg2 
{
	public static void main(String[] args) {
		LinkedHashSet<String > s =new LinkedHashSet<String>();
		s.add("Pen"); 
		s.add("Pencil");
		s.add("Mouse");
		s.add("Phone");
		s.add(null);
		s.add("AC");
		s.add("Bottle");
		s.add("Earphone");
		s.add("Pen");  //duplicate not allow
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())  {
			System.out.println(itr.next());
		}
	}
}


