package pack.com;
// To get the class name of array object in java

public class ClassNameArray 
{
	public static void main(String args[])
	{
		//Declaration and initializing of an array
		int arr[]= {1,2,3};
		
		//getting the class name
		Class a=arr.getClass();
		String name=a.getName();
		
		//print class along with name
		System.out.println(a);
		//print only the name of the class
		System.out.println(name);
	}
}
