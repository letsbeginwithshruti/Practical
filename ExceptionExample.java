package exception;
//Different types of exception
public class ExceptionExample  {
	public void show()
	{
		String a="I am error";
		System.out.println(a);
		try {
			int i = 50/0;   //Arithmetic exception
			System.out.println(i);
			String s="Riya";
			System.out.println(s.length());
			int arr[] = new int [3];    //new array
			arr[4] = 24;      //Array Index out of bound exception
			int m = Integer.parseInt(s);   //number format exception
			System.out.println(m);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		String b="I cannot be handled";
		System.out.println(a+" "+b); //I am error + I cannot be handled
	}
	public static void main(String[] args) {
		ExceptionExample ep=new ExceptionExample();
		ep.show();
	}
}
