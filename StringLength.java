package string;
import java.lang.String;
public class StringLength 
{
	public static void main(String[] args) 
	{
		String str=" Anudip Foundation ";
		System.out.println(str.startsWith("Anudip"));
		System.out.println(str.endsWith("s"));
		//Get the length of str
		int len=str.length();
		System.out.println("The length of the string "+str+" is: "+len);
		
		System.out.println("_________Replace method_________");
		System.out.println(str.replace("p","P"));
		
		//System.out.println("The length of the String "+str+"is : "+str.length());
		//Trim()removes the white space present at the beginning and end of the string
		System.out.println("_________Trim method_________");
		System.out.println(str.trim());
		System.out.println("_________CharAt() method_________");
		System.out.println("\t"+str.charAt(5)); //prints the character at index 5
		
		//Concat two strings
		String s="Pallabi Ma'am";
		System.out.println("______After Concatinating_____");
		System.out.println(str.concat(s));
	}		
}

	