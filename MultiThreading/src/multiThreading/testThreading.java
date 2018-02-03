package multiThreading;

public class testThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		
		Thread t1 = new Thread(a,"A");
		Thread t2 = new Thread(a,"B");
		t1.start();
		t2.start();
		System.out.println("main task finished");
	}

}
