package exception;

//Exception handling using Try - Catch

public class TryCatch 
{
	public static void main(String[] args) {
		try {
			int num=25/0; //may exception occur
			System.out.println("Result"); //If exception does not occur then this line will execute
		} //catch (ArithmeticException r)  //handling exception
		catch(Exception e)
		{
			System.out.println("Number can't be divided by zero"); //prints this message
			System.out.println(e); //gives the exception name that is occuring
			System.out.println(25/5); //prints the value 5
		}
		System.out.println("The End"); //This line will be executed as it is outside the try-catch block 
	}
}
