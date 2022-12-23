package string;
import java.lang.String;
	import java.util.Scanner;

	public class StringTest {
		public void show() //method
		{
			Scanner sc=new Scanner(System.in); //user input
			System.out.println("Enter String"); //Line no.1
			String A=sc.next();//1st string
			String B=sc.next(); //2nd string
			
			System.out.println(A.length()+B.length()); //1st string length+(concat)2nd string 1
			System.out.println((A.compareTo(B)>0)? "Yes":"No"); //compare to()
			System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+" "+B.substring(0,3).toLowerCase()+B.substring(1));
			//System.out.println(A.startswith(r)+A.endswith(a)+B.startwith(s)+B.endwith(i));
		} //substring(), upper case, lower Case java

		public static void main(String[] args) {
			StringTest t=new StringTest();
			t.show();

		}

	}



