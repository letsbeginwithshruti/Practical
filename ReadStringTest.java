package fileReaderWriter;

import java.io.Console;
public class ReadStringTest{    
public static void main(String args[]){    
Console c=System.console();    
System.out.println("Enter your name: ");    
String n=c.readLine();    
System.out.println("Welcome "+n);    
}    
}
		
		/*System.out.println("Please enter your password: ");
		char [] ch =c.readPassword();
		String s1 = String.valueOf(ch);  //converting char array into string
		System.out.println("Your Password is: "+s1);*/
		//}
	//}

