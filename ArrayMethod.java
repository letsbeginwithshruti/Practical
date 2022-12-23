package pack.com;
//Returning array from a method
public class ArrayMethod 
{
	static int[]get() //Method which return an array
	{
		return new int[] {10,20,30};
	}
	public static void main(String args[])
	{
		int arr[]=get(); //Calling the name which return an array
		for(int i=0;i<arr.length;i++) //Print the value of an array
			System.out.println(arr[i]);
	}
}
