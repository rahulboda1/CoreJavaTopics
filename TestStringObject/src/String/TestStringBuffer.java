package String;

public class TestStringBuffer {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("asd");	//new stringBuffer object is created 
		StringBuilder sb2 = new StringBuilder("qwe");	//new stringBuffer object is created
		System.out.println(sb1==sb2);	//false represents both are different objects
		sb1=sb1.append("123");
		System.out.println(sb1==sb1.append("123")); //true represent same object is modified
		sb2=sb2.append("123");
		System.out.println((sb2==sb2.append("123")));	//true represent same object is modified
		
		StringBuilder rollNum = new StringBuilder("RAHOO"); //same object is modified
		for(int i=1;i <= 5; i++)
		{
			StringBuilder temp = rollNum.append("asd"+i);
			System.out.println(temp);
		}
		}
	}
