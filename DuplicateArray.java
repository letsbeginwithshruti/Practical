/*Q.2   Write a Java program to find the duplicate values 
      of an array of integer values.*/

package pack.com;

import java.util.Scanner;

public class DuplicateArray //main class
{
	public static void main(String ags[]) //main method
	{
		int a[]=new int [10];
		int n,i,j,f=0;
		for (i=0; i<a.length;i++) 
        {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:- "); //Printing 10 numbers
		a[i]=sc.nextInt();
        }
		for (i = 0; i <a.length; i++) 
        {
			for (j = i+1; j<a.length; j++) 
            {
                if (a[i] == a[j]) //Comparing the values of the two loops
                {
                    System.out.println("Duplicate Elements are  : "+a[j]); //Printing the duplicate number if present
                    f=1;
                    break;
                }
            }
        }
		if(f==0)
        {
        	System.out.println("NOT FOUND"); //prints this message if duplicate values are not found
        }
	}
}
	

