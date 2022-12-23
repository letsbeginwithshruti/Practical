package pack.com;

public class CopyArray  //Class
{
	public static void main(String args[])
	{
		//declaring source array
		char[]copyFrom= {'d','e','c','f','f','e','i','n'};
		//declaring a destination array
		char[]copyTo=new char[7]; //new array
		System.arraycopy(copyFrom,2,copyTo,0,5);
		//print the destination array
		System.out.println(String.valueOf(copyTo));
	}
}
