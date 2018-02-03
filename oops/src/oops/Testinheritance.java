package oops;

public class Testinheritance {

	public static void main(String[] args) {
		Person p1 = new Person("abc",123);
//		p1.name = "Rahul";
//		p1.age = 23;
		p1.showPerson();
		
		Employee e1 = new Employee("Rahul",23,"manager",265465);
		e1.showemployee();
//		e1.name = "asd";
//		e1.age = 21;
//		e1.desig = "Manager";
//		e1.Salary = 21.34;
		
		Student s1 = new Student("Rahul",23);
		s1.rollNum = "123eds";
//		s1.Grade = "a";
		
		
		
		e1.showPerson();
		s1.Showstudent();
		s1.showPerson();
	}

}
