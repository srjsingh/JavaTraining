package constructorConcept;

public class B extends A {

	public B() {
		super(); // super is used to call constructor of parent class
		// super should always be the first call in constructor
		// there cannot be more than 1 super keyword in constructor
		System.out.println("child class constructor");
	}

	public B(int i) {
		super(i);
	}

	public B(int i, int j) {
		super(i, j);
	}

	public static void main(String[] args) {

		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);

	}

}
