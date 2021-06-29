package OOPConcept_Part1;

public class FunctionsInJava_07 {

	// main method -->starting point of execution
	public static void main(String[] args) {
		
		FunctionsInJava_07 obj = new FunctionsInJava_07();
		//one object will be created, obj is the reference variable referring to the object
		//after creating the object, the copy of all the non static methods will be given to this object
		
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int d = obj.division(6, 2);
		System.out.println(d);
		
		// main method is void  --> never returns a value
		

	}
	
	// non static methods
	
	//1. No input no output
	
	// void mean doesn't return any value
	public void test() {
		
		System.out.println("testmethod");
		
	}
	
	//2. no input but returns value
	// return type int
	public int pqr() {
		
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}
	
	// return type string
	public String qa() {
		
		System.out.println("qa method");
		String s = "Selenium";
		
		return s;
	}
	
	//return type int
	// x,y --> input parameters/arguments
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		
		return d;
	}

}
