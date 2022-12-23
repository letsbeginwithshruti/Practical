package collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

public class ArrayListUsingUserDefinedCl 
{
	public static void main(String[] args) {
		 Bnak b = new Bnak(123465, "Shifa" , 5000.67, 20);
		 Bnak b1= new Bnak (125643,"Nisha",7000.67,21);
		 Bnak b2= new Bnak (123922,"Shruti",5400.67,22);
		 Bnak b3= new Bnak (126432,"Neha",4000.67,28);
		 Bnak b4= new Bnak (123240,"Eliza",8000.67,30);
		 Bnak b5= new Bnak (132187,"Falak",9000.67,25);
		// List<Bnak> a2 = new ArrayList<Bnak>();
		 Deque<Bnak> a1= new ArrayDeque<Bnak>();
		 a1.add(b);
		 a1.add(b1);
		 a1.add(b5);
		 a1.add(b3);
		 a1.add(b2);
		 a1.add(b4);
		 
		 Iterator it= a1.iterator();
		 while(it.hasNext())  {
			 Bnak obj= (Bnak) it.next();
			 System.out.println(obj.accountNo+" "+obj.customerName+" "+obj.balance+" "+obj.customerAge);
		 }
	}
}
