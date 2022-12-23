package pack.com;
//collection framework (arrayList)
import java.util.ArrayList;

public class Autoboxing2 
{
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		//Creating an empty array list of primitive type
		a1.add(1); //adding the int primitive type value by using add()
		a1.add(2);
		a1.add(3); //auto boxing
		System.out.println("ArrayList: "+a1);
	}
}
