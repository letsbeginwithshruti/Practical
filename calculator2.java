package pack.com;

import java.util.Scanner;

public class calculator2 
{
	public int addition(int...add)
	{ //using varargs
		int sum=0;
		for(int i:add) //we use foreach loop here
		{
			sum=sum+i;
		}
		return sum;
	}
	public int subs(int...sub)
	{
		int x=0;
		for(int i:sub)
		{
			x=i-x;
		}
		return x;
	}
	public int multi(int...mul)
	{
		int multiply=1;
		for(int i:mul)
		{
			multiply=multiply*i;
		}
		return multiply;
	}
	public static void main(String args[])
	{
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:- ");
		addition=sc.nextInt();
		subs=sc.nextInt();
		multi=sc.nextInt();
		System.out.println("The result is:- "+result);
	}
}
