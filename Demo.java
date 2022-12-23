package pack.com;
 interface Test1 
{
	void show();
}
 class Demo_1 implements Test1
{
	public void show()
	{
		System.out.println("hello my future employees");
	}
}
class Demo implements Test1
{
	public void show()
	{
		System.out.println("Welcome to my company");
	}
	public static void main(String args[])
	{
		Test1 obj=new Demo();
		obj.show();
	}
}
