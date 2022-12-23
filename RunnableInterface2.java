package thread;
// Thread( Runnable obj, String name)
public class RunnableInterface2 implements Runnable 
{
	public void run()
	{
		System.out.println("Thread Running");
	}
	public static void main(String[] args) {
		Runnable ri= new RunnableInterface2();
		Thread th = new Thread(ri,"String name");
		th.start();
		String s=th.getName();
		System.out.println(s);
	}
}
