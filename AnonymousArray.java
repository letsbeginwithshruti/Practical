package pack.com;

public class AnonymousArray 
{
	static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void main(String args[])
	{
		print(new int[] {10,20,30,40,50,60,70,80});// Passing anonymous array to method
	}
}
