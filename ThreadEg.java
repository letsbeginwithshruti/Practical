package thread;

public class ThreadEg extends Thread  //main class extends the thread class
{
	public void run()  //run()---a method of thread
	{
		System.out.println("I am Thread....thread is running");
	}
	public static void main(String[] args)   
	{
		ThreadEg t= new ThreadEg();
		t.start();
		//t.run();  // can be written as instead of t.start();----as both work are same
		t.setName("Shifa");  //first setName
		String s=t.getName();  //then getName
		System.out.println(s);   //here printing the setName---Shifa
	}
}
