package multiThreading;

public class Race implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		try {
			for(int i=1;i<10;i++) {
				Thread.sleep(1000);
				System.out.println(name+" completes lap number: "+i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
