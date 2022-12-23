package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
//java.lang.Throwableclass;
public class NestedException 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		try {
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(" "+(x/y));
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
