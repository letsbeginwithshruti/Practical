package pack.com;
//Primitive to wrapper(obj)
public class Autoboxing 
{
	public static void main(String args[])
	{
		int a=10; //primitive type
		Integer i= Integer.valueOf(a); //Converting int to Integer
		Integer j=a;  //Now compiler will write Integer.valueOf(a)autoboxing
		System.out.println(a+" "+i+" "+j);
		
	}
}
