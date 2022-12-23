package exception;

public class MultiCatch
{
	static void mfunc()
	{
		try {
			int i=50/0;
			System.out.println(i);  // Arithmetic Exception
			int arr[]=new int [3];
			arr[4]=24;   //Array Index Out of bound exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Only 1st Arithmetic  exception will execute");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Now Array index out of bound exception will occur");
		}
		finally {
			System.out.println("I am finally block");
		}
	}
	public static void main(String[] args) {
		mfunc();
	}
}
