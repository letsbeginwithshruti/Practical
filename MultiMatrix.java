package pack.com;

public class MultiMatrix 
{
	public static void main(String args[])
	{
		//create matrix
		int a[][]= {{2,4},{1,4}};
		int b[][]= {{2,2},{3,5}};
		//for storing result creating another matrix
		int c[][]=new int[2][3];
		//printing row
		for(int i=0;i<2;i++)
		{
			//printing column
			for(int j=0;j<2;j++)
			{
				
				c[i][j]=a[i][j]*b[i][j];
				//c[i][j]+=a[i][j]*b[i][j];
				System.out.print(c[i][j]+" ");//product of the matrix
			}
			System.out.println();
		}
		
	}
}
