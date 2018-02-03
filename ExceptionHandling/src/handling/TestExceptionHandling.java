package handling;

import java.io.IOException;

class Demo{
	void test1(int a) throws ArithmeticException,IOException{
		if (a==0)
		{
			throw new ArithmeticException();
		}
		else {
			System.out.println("test1 didn't generate Arithmetic Exception");
		}
	}

}

public class TestExceptionHandling {
			public static void main(String[] args) throws ArithmeticException, IOException {
				 Demo d = new Demo();
				 try {
					 d.test1(0);
				 	} catch (ArithmeticException e)	{
						 System.out.println("Arithmetic Exception generated");
						 int a = 10; int b = 20;
						 int c= a+b;
						 System.out.println("c = "+c);
					 } catch (IOException e) {
						 System.out.println("IOException generated");
					 }  finally {
					 System.out.println("finally block executed");
				 }
				 
		System.out.println("last line of code");
			}
}
