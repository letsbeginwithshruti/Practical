package pack.com;
import java.lang.String;
public class MutableExampleString 
{
	public static void  my()
	{
		//String Buffer
		StringBuffer s=new StringBuffer("Hello"); //object of string buffer class
		s.append("World");
		System.out.println("String is:  "+s); //Hello world
		s.insert(2, "Riya");   // (int off set, String s)
		System.out.println("insert is : "+s); //HeRiyallo World
		s.replace(1, 3,"java");  //(beginwith, endswith, String s)
		System.out.println("replace is : "+s); // Hjavaiyalloworld
		System.out.println("Capacity is : "+s);
		//String Builder
		StringBuilder s1=new StringBuilder("World"); //s1= World
		s1.replace(1, 3, "java");
		System.out.println("replace is : "+s1); //Wjavald
		s1.delete(1, 3);
		System.out.println("delete is : "+s1); //Wvald
		s1.reverse();
		System.out.println("reverse is : "+s1); //dlavW
	}
	public static void main(String[] args) {
		my();
		
	}
}
