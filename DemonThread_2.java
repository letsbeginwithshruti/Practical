package thread;

public class DemonThread_2 extends Thread
{
	public void run() {
		System.out.println("Name: "+Thread.currentThread().getName());
		System.out.println("Demon: "+Thread.currentThread().isDaemon());
		if(Thread.currentThread().isDaemon()) {
			System.out.println("I am demon");
		}
		else {
			System.out.println("I am user");
		}}
		public static void main(String []args) {
			DemonThread_2 t1=new DemonThread_2();
			DemonThread_2 t2=new DemonThread_2();
			t1.start();
			t1.setDaemon(true);
			t2.start();
		}
	}

