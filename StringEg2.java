package string;
import java.lang.String;
//char[] work same as java string
public class StringEg2 
{
	public void show() //method 1
	{
		char[] arr= {'j','a','v','a'}; //char type array
		String s=new String(arr);
		//System.out.println(charAt[3]);
		System.out.println("Value is : "+s);
		System.out.println(arr);
	}
	public void myFunction() //method 2
	{
		//String m="Pallabi";
		String m1="Mamta";
		String m2=new String(m1); //creating an object of string
		System.out.println(m2);
	}
	public static void main(String[] args) {
		StringEg2 s=new StringEg2();
		s.show();
		s.myFunction();
	}
}

