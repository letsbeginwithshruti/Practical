package exception;

import java.util.ArrayList;
import java.util.Arrays;
//Group of similar class, sub pack, interface
class LanguageCheckException extends Exception
{
	public LanguageCheckException(String str)  {
		super(str);
	}
}
public class CustomExceptionEg2 
{
	ArrayList<String>language=new ArrayList<String>
	(Arrays.asList("eng","bengali","tamil"));
	public void check(String a)  throws LanguageCheckException
	{
		if(language.contains(a)) {
			throw new LanguageCheckException (a+"language already exists: ");
		}
			else
				language.add(a);
			System.out.println("language added in list + language");
		}
		public static void main(String args[]) throws LanguageCheckException
		{
			CustomExceptionEg2 c=new CustomExceptionEg2();
			c.check("telugu");
			c.check("tamil");
		}
	}

