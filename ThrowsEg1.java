package exception;

import java.io.IOException;

public class ThrowsEg1 
{
	void show() throws IOException
	{
		throw new IOException("Throw exception"); //checked
	}
	void display() throws IOException
	{
		show();
	}
	void fetch() 
	{
		try {
			display();
		}catch(Exception e)
		{
			System.out.println("exception solved");
		}
	}
	public static void main(String[] args) 
	{
		ThrowsEg1 ob=new ThrowsEg1();
		ob.fetch();
///if we call a method that declares n exception, then we must declare the exception in main to handle it.
		//ob.show();  
		//ob.display();
		System.out.println("The End");
	}
}
