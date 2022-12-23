package thread;

public class RunnableThreadTest1 implements Runnable {
	public void run() {       //run method
		for(int i=0;i<3;i++) {
		System.out.print("ACBA");
	} }
	public void run2() {
		for(int j=0;j<3;j++) {
			System.out.print("CABC");
		}
	}
	public static void main(String[] args) {     //main method
		Runnable r=new RunnableThreadTest1();    //object of runnable by using the main class
		//Thread t=new Thread();
		Thread t1=new Thread();   //object of thread class
		Thread t2=new Thread();
		t1.run();
		t2.run(); }
}