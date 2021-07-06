package TestMain;

public class TestBase {
	
	//JVM -- main (String[] args) -- public static void
	public static void main(String[] args) {

		System.out.println("main method1");
		
		main(0);
		main(0, 0);
		main("main");

	}

	public static void main(int a) {

		System.out.println("main method2");

	}

	public static void main(int a, int b) {

		System.out.println("main method3");

	}

	public static void main(String args) {

		System.out.println("main method4");

	}

}
