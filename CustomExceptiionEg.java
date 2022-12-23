package exception;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str)
	{
		super(str);
	}
}
public class CustomExceptiionEg 
{
	public void checkage(int age) throws InvalidAgeException {
	if(age<=18 || age>=25) {
		throw new InvalidAgeException("Invalid age for enrolling in java course");
}else {
	System.out.println("Proper age for enrolling for java course");
	}
} 
	public static void main(String args[]) throws InvalidAgeException {
		CustomExceptiionEg c = new CustomExceptiionEg();
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		c.checkage(age);
		//c.checkage(17);
	}
}
