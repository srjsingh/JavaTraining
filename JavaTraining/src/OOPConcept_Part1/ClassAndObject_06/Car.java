package OOPConcept_Part1.ClassAndObject_06;

public class Car { // class is a entity for defining behaviour or properties of that class
	
	// Class/Global vars:
	int mod;
	int wheel;

	public static void main(String[] args) {
		
	 // new Car() -> this is the object of Car class
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		
		a.mod = 2015; // duplicate object reference is not allowed
		a.wheel = 4; // a is object reference variable not object
		
		b.mod = 2014;
		b.wheel = 4;
		
		c.mod = 2013;
		c.wheel = 4;
		
		a=b;
		b=c;
		c=a; 
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		a.mod = 10;
		System.out.println(a.mod); // two object reference variable can refer to same object
		c.mod = 20;
		System.out.println(c.mod);
		
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
	}
	

}
