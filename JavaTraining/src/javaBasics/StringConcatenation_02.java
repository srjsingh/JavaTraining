package javaBasics;

public class StringConcatenation_02 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World!";
		
		double c = 12.33;
		double d= 10.33;
		
		// Left to right execution always
		// println - is used to print on the console with new line
		// print - is used to print on the console
		
		System.out.println(a+b);
		
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(c+d);
		
		System.out.println(x+y+c+d);
		
		System.out.println("HelloWorld");
		
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
		
		System.out.println("The summation of a + b is :" + (a+b));
		
		System.out.print("Hello Selenium");
		System.out.println("Hello Testing");

	}

}
