package exception;

public class NestedTry 
{
	 static public void main(String[] args) {
		try {       //outer try block
			try {    //inner try block 1
				System.out.println("Going to divide by 0");
				int b =19/0;
			}
			catch(ArithmeticException e) {  //Catch block of inner try block 1
				System.out.println(e);
			}
			try {   //inner try block 2
				int a []= new int[5];
				a[6]=4;   //Assigning the value out of aray bounds 
			}
			catch(ArrayIndexOutOfBoundsException e)  //catch block of inner try block 2
			{
				System.out.println(e);
			}
			System.out.println("Other Statement");
			}
		catch(Exception e)   //catch block of outer try block
		{
			System.out.println("Hnadled the exception (outer catch )");
		}
		System.out.println("Normal Flow......");
	}
}
