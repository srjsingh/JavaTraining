package constructorConcept;

public class ConstructorWithThisKeyword {
	
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age) {
		
		this.name = "Suraj"; //this keyword is used to access variable of class
		this.age = 24;
		
		System.out.println(this.name);
		System.out.println(this.age);
		
		System.out.println(name);
		System.err.println(age);
	}

	public static void main(String[] args) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 25);
		
	}

}
