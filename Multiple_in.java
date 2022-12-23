package pack.com;

interface Multiple_in1 //
{
	void show();
}
interface Multiple_in2
{
	void show();
}
class Multiple_in implements Multiple_in1,Multiple_in2
{
	public void show()
	{
		System.out.println("Hi");
	}
	/*public void display()
	{
		System.out.println("Hello");
	}*/
	public static void main(String[] args) 
	{
		Multiple_in ob=new Multiple_in();
		ob.show();
		//ob.display();
	}
}