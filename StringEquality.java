package string;
import java.lang.String;
import java.util.Scanner;

public class StringEquality 
{
	public static void main(String[] args) {
		String str1, str2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first string: ");
		str1=sc.next();
		
		System.out.println("Enter the second string: ");
		str2=sc.next();
		
		//comparing two input string
		if(str1.equals(str2))
			System.out.println("Equal Strings");
		else
			System.out.println("Unequal Strings");
	}
}