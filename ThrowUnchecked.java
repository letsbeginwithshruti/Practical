package exception;
//Example of throw unchecked exception------> runtime
public class ThrowUnchecked 
{
	public static void eligible(int age)  {
		if (age<18) {
		//throw arithmetic exception if person age is <18
		throw new ArithmeticException("U are not eligible for vote");
	}
	else {
		System.out.println("Person eligible for vote");
	}
}
	public static void main(String[] args) {
		eligible(12);
		System.out.println("DONE");
	}
}
