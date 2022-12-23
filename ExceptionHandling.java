package exception;

import org.omg.IOP.CodecPackage.FormatMismatch;

class InvalidDivisionException extends Exception {
	public InvalidDivisionException(String s) {
	}
}
	class InvalidIndexException extends Exception {
		public InvalidIndexException(String s) {
	}
	}
		class MyException extends Exception {
			public MyException(String s) throws MyException {
				throw new  MyException("");
			}
	}

public class ExceptionHandling {
	public static void show()
	{
		try {
			try {
				int a=8/0;
			}catch(InvalidDivisionException e) {
				System.out.println(e);
			}
			try {
				String str="Hello";
				int a=Integer.parseInt(str); 
				
			}catch(FormatMismatch f) {
				System.out.println("Format Mismatch");
			} try {
				String str="Java";
				str.charAt(6);
			}catch(InvalidIndexException i) {
				System.out.println("index is invalid");
			}
			try {
				int arr[]=new int[5];
				arr[7]=2;
			} catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("Array index is invalid");
			}
		}
		finally {
			System.out.println("All the exceptions are handled");
		}
	}
	public static void main(String[] args) throws Exception{
		ExceptionHandling h=new ExceptionHandling();
		h.show();
	}

}