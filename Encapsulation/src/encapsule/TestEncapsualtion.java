package encapsule;

public class TestEncapsualtion {

	public static void main(String[] args) {
		Customer c1 = new Customer(101,"Billa",5000);
		Customer c2 = new Customer(102,"Rebel",10000);
		System.out.println("Customer id = "+c1.getCustomerId()+"; Customer Name = "+c1.getCustomername()+"; Amount = "+c1.getAmount());
		System.out.println("Customer id = "+c2.getCustomerId()+"; Customer Name = "+c2.getCustomername()+"; Amount = "+c2.getAmount());
		System.out.println("********");
		
		c1.setPhone(129323);
		c2.setPhone(12345);
		
		c1.setAmount(2000);
		c2.setAmount(-3000);
		
		System.out.println("Customer phone ="+c1.getPhone()+"; Amount = "+c1.getAmount());
		System.out.println("Customer phone ="+c2.getPhone()+"; Amount = "+c2.getAmount());
		System.out.println("*******");
	}

}
