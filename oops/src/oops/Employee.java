package oops;

public class Employee extends Person {
	String desig;
	double Salary;
	
	Employee(String name,int age,String desig,double Salary){
		super("Rahul",23);
		this.desig = desig;
		this.Salary = Salary;
		System.out.println("Employee Constructor "+name);
	}
	void showemployee() {
		System.out.println("name = "+name+"; age ="+age+"; desig = "+desig+"; Salary ="+Salary);
	}
}
