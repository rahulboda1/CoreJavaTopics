package oops;

public class Person {
	String name;
	int age;

	Person(String name,int age){
		this.name = name; this.age = age;
		System.out.println("not a default constructor "+name+" "+age);
	}
	void showPerson(){
		System.out.println("name= "+name+"; age= "+age);
	}
}
