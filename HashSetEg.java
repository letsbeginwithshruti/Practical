package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg 
{
	public static void main(String[] args) {
		Set <String > s =new HashSet<String>();
		s.add("Pen"); //duplicate not allow
		s.add("Pencil");
		s.add("Mouse");
		s.add("Phone");
		s.add(null);
		s.add("AC");
		s.add("Bottle");
		s.add("Earphone");
		s.add("Pen");
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())  {
			System.out.println(itr.next());
		}
	}
}
