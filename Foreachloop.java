package pack.com;

public class Foreachloop 
{
	public static void main(String args[])
	{
		int sum=0; 
		int arr[]= {1,2,3,4,5}; //Declaring array
		for(int i:arr)
		{
			System.out.println(i);
			sum=sum+i;
		}	
		System.out.println("Sum is:- "+sum);
	}
}
