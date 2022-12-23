package pack.com;

public class ArrayEg2 
{
	public static void main(String args[])
	{
		int a[]=new int[5]; //declaration and Instantiation
		//Initialization
		a[0]=2;
		a[1]=9;
		a[2]=5;
		a[3]=7;
		a[4]=1;
		/*int a[]= {2,9,5,7,1}; //declaration, instantiation and initialization
		//Travrsing an array
		for(int i:a)*/
		for(int i=0;i<a.length;i++) //length is one of the property of an array
		{
			System.out.println(a[i]);
		}
	}
}
