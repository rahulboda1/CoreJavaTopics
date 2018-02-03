package oops;

public class Student extends Person {
	String rollNum;
	String Grade;
	
	Student(String  name,int age){
		super("adf",89);
		System.out.println("student constructor");
	}
	void Showstudent() {
		System.out.println("name = "+name+"; age ="+age+"; rollNum = "+rollNum+"; Grade ="+Grade);
	}
}
