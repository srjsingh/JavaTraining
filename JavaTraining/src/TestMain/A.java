package TestMain;

public class A {

	public static void main(String[] args) {
		
		System.out.println("A main method");
		B.main(args); //It will get executed infinite time as in B's main method we are calling A's main method
		
	}

}
