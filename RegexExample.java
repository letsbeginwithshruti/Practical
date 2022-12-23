package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexExample 
{
	//Three way to represent pattern & matcher
	//1st way
	public static void main(String[] args) {
		/*Pattern p=Pattern.compile(".a"); //single dot represents single character
		//compile regular expression into pattern
		Matcher m=p.matcher("ma"); //.a dot. represent single char m 
		boolean b=m.matches(); //output for b //true
		
		//2nd way
		boolean bb=Pattern.compile("..m").matcher("aam").matches();
		
		//3rd way
		boolean b1=Pattern.matches(".a","sa"); //true
		System.out.println(b+" "+bb+" "+b1);
		
		//Character class ---
		//[abc]=a, b, c,[^abc]= any char except abc, [a-zA-Z]==either upper or lower case and both
		boolean b5=Pattern.matches("[a-zA-Z]","A");
		boolean b3=Pattern.matches("[pqr]","pqr");
		boolean b6=Pattern.matches("[^abc]","r");
		System.out.println(b5+" "+b3+" "+b6);*/
		
		//Quantifiers 
		//x? - x occur once or not at all    x+-- x  occur once or more than one
		//x* -- x  occur n or more time x {7, } only 7 char or more
		
		boolean b7=Pattern.matches("[a-zA-Z0-9]{15}","Anudip123ppp");
		System.out.println(b7);
		
		Boolean b8=Pattern.matches("[a-zA-Z0-9+_.-]*@[a-z]*+\\.[a-z]{3}","Shifa789_.-@gmail.com"); 
		Boolean b=Pattern.matches("[a-zA-Z0-9+_.@]{11}", "Shifa123_@gmail.com");
		System.out.println(b);
	}
}



