package multiThreading;

public class ticketbooking implements Runnable {
	int tickets=50;
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		synchronized (this) {
		if (tickets>0) {
			System.out.println(" Booking is completed for "+name);
			tickets--;
		}
		else {
		System.out.println("Tickets are finished,Sorry "+name);
	 	}
		System.out.println("remaining tickets: "+tickets);
		}
}
}