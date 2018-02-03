package multiThreading;

public class B implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=20;i<30;i++) {
			System.out.println("B is executed: "+i);
		}
	}

}
