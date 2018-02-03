package multiThreading;

public class TestJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Race race = new Race();
		Thread t1 = new Thread(race,"bike1");
		Thread t2 = new Thread(race,"bike2");
		t1.start();
		t2.start();
		try {
			System.out.println("Thread t1 is alive? : "+t1.isAlive());
			System.out.println("Thread t2 is alive? : "+t2.isAlive());
			t1.join();
			t2.join();
			System.out.println("Thread t1 is alive? :"+t1.isAlive());
			System.out.println("Thread t2 is alive? :"+t2.isAlive());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String threadname = Thread.currentThread().getName();
		System.out.println("All laps are completed and the thread running this statement is: "+threadname);
		
	}

}
