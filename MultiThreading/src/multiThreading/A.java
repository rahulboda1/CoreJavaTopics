package multiThreading;

public class A implements Runnable{

	@Override
	public void run() {
		for (int i=1;i<10;i++) {
			Thread t = Thread.currentThread();
			System.out.println("A is executing : "+i+" Thread = "+t.getName());
		}
	}

}
