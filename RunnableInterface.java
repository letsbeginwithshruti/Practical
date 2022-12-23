package thread;

public class RunnableInterface implements Runnable 
{
	public void run()
	{
		System.out.println("I am Thread....thread is running");
	}
	public static void main(String[] args) {
		RunnableInterface ri= new RunnableInterface();
		Thread t=new Thread(ri);  //creating a thread class object explicitly as tread class has not been extend
		t.start();
		//t.run(); //same as t.start();---will give the same output
	}
}
