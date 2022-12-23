package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEg 
{
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>();
		map1.put(101, "Mango");
		map1.put(108, "Orange");
		map1.put(105, "Banana");
		map1.put(103, "Grapes");
		map1.put(105, "Chiku");
		map1.put(null, null);
		map1.put(102, null);
		map1.put(null, "Apple");
		for(Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());  }
		System.out.println("-----------------------------------------------------");
		map1.putIfAbsent(102,"CustardApple");
		map1.putIfAbsent(101, "Watermelon"); 
		for(Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			//key
			System.out.println("Keys : "+map1.keySet());
			//value
			System.out.println("Values : "+map1.values());
			//key an value
			
			System.out.println("Keys and values : "+map1.entrySet());}
			map1.remove(103);
			for(Map.Entry m1 : map1.entrySet()) {
			System.out.println(m1.getKey()+""+m1.getValue());
		}
		}}