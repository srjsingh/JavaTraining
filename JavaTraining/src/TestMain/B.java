package TestMain;

public class B {
	
	public static void main(String[] args) {
		
		System.out.println("B main method");
		
		A.main(args); //It will get executed infinite time as in A's main method we are calling B's main method
		
	}

}
