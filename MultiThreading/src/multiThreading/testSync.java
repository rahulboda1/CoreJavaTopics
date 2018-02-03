package multiThreading;

public class testSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ticketbooking tb = new ticketbooking();
		Thread t1 = new Thread(tb,"t1");
		Thread t2 = new Thread(tb,"t2");
		Thread t3 = new Thread(tb,"t3");
		t1.start();
		t2.start();
		t3.start();
	}

}
