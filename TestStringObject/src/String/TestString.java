package String;

public class TestString {
	public static void main(String[] args) {
	String s1 = "hello";	// a new string object s1 is created
	String s2 = "hello";	// here s2 refers to the same object because of the same content
	System.out.println(s1==s2);		// checking the memory address of s1 and s2. true represents both are same object
	String s3 = new String("Hello");	//creating new object s3
	String s4 = new String("Hello");	//creates another object s4 with same content
	String s5 = "Hello";	// creates another object  s5
	System.out.println("comparing s3 and s4 objects: "+(s3 == s4)+"; Comparing s5 and s4 objects memory: "+(s5 ==s4));
			//both false represents new objects are created at different memory address
	s1=s1.concat(" Rahul"); //concatenating s1 object-concatenation creates a new object
	System.out.println(s1);
	s1=s1.concat(" 418"); //concatenating s1 again-new object
	System.out.println(s1);
	System.out.println("checking whether the concatenated objects are same : "+ (s1.concat(" Rahul")==s1.concat(" 418")));
				// false represets they are different
	String rollNum = "RAHOO"; // proof for new object is creating.
	for(int i=1;i <= 5; i++)
	{
		String temp = rollNum.concat("asd"+i);
		System.out.println(temp);
	}
	}
}