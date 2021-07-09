package OOPConcept_Part1;

public class StaticAndNonStaticConcept_10 {

	// global vars: the scope of global vars will be available across all the
	// functions with some conditions.

	String name = "Tom"; // non static global var
	static int age = 20; // static global var

	public static void main(String[] args) {

		// how to all static methods
		// 1. directly by name
		sum();

		// 2. calling by class name
		StaticAndNonStaticConcept_10.sum();

		// how to call static vars
		System.out.println(age); // by name
		System.out.println(StaticAndNonStaticConcept_10.age); // by class name

		StaticAndNonStaticConcept_10 obj = new StaticAndNonStaticConcept_10();
		System.out.println(obj.name);
		System.out.println(obj.age); // static var by object reference
		obj.sendMail();

		// Can I access static methods by using object reference? yes
		obj.sum();

	}

	public void sendMail() { // non static method

		System.out.println("send mail method");
		
		div(); // we can call non static method from a non static method directly by name

	}

	public static void sum() { // static method

		System.out.println("sum method");

	}

	public void div() {

		System.out.println("this is div method");

	}

}
