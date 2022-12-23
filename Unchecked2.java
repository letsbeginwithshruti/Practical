package exception;
//whether the student is pass or not (unchecked)
public class Unchecked2 
{
	public static void mDisplay(int a)throws ArithmeticException
	{
		if(a>0 && a<=35)
		{
			throw new ArithmeticException("Value cannot be less than 35");
		}
		else {
			System.out.println("You are Pass");
		}
	}
	public static void main(String[] args) {
		mDisplay(30);  //pre-defined value
	}
}
