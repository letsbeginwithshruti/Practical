package collection;

import java.util.Vector;

public class VectorEg 
{
	public static void main(String[] args) {
		//creating vector
		Vector <String > vc = new Vector<String>(4);
		//adding elements
		vc.add("Dog");
		vc.add("Cat");
		vc.add(0,"Tiger");
		vc.add("Lion");
		//checking size and capacity
		System.out.println("Size : "+vc.size());
		System.out.println("Capacity : "+vc.capacity()); // old cap *3 /2 +1
		//Add more elements
		vc.addElement("Cow");
		vc.addElement("Goat");
		System.out.println("After adding elements : ");
		// checking cat is present in the vector or not
		System.out.println(vc);
		if(vc.contains("Cat"))  {
			System.out.println("Element pesent");
		} else {
			System.out.println("Element not present ");
		}
		//getting 1st element
		System.out.println("First element is : "+vc.firstElement());
		//getting last element
		System.out.println("Last element : "+vc.lastElement());
		// checking index of specified element
		System.out.println("Index : "+vc.indexOf("Cat"));
	}
}
