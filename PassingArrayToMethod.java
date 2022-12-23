package pack.com;

public class PassingArrayToMethod 
{
	//Creating method which pass an array as a parameters
	static void maximum(int array[]) //method name maximum
	{
		int max=array[0];
		for(int i=1;i<array.length;i++)
			if(max<array[i])
				max=array[i];
				System.out.println(max);
			
	}
			public static void main(String[] args)
			{
				//Declaring & Initializing array
				int a[]= {5,7,9,2,3};
				maximum(a); //passing array to a method max

			}
	}

