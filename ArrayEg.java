package pack.com;

public class ArrayEg 
{
	public static void main(String args[])
	{
		//Array declaration
		String []names= {"Pallabi","Shifa","Niladri","Nisha","Soumya","Akshay"};
		//for loop
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	
		System.out.println();
		//Array declaration
		int []phone= {123,456,567,789,955,333,555,111,2345,7890};
		//for each loop
		for(int n:phone)
		{
			System.out.println(n);
		}
	}
}
