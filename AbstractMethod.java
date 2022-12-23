package pack.com;

abstract class Test //abstract class --> parent class
{
	abstract void display(); //abstract method
	void show() //non abstract method
	{
		System.out.println("Non abstract method invoked");
	}
}
class Demo1 extends Test //1st child class
{
	void display()
	{
		System.out.println("Demo1 method invoked");
	}
}
class Demo2 extends Test //2nd child class
{
	void display()
	{
		System.out.println("Demo2 method invoked");
	}
}
class AbstractMethod
{
	public static void main(String args[])
	{
		Test obj =new Demo1();
		Test obj1 =new Demo2();
		obj.display();
		obj1.display();
	}
}
