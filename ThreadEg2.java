package thread;
//directly we use thread class without extend
//with & without set name we can name the Thread
public class ThreadEg2 
{
	public static void main(String[] args) {
		Thread t = new Thread("Shifa");
		Thread t1 = new Thread();
		t.start();
		t1.start();
		 t1.setName("Iqbal");
		System.out.println("Thread 0: "+t.getName());
		System.out.println("Thread 1: "+t1.getName());
	}
}
