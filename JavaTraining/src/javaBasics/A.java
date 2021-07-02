package javaBasics;

public class A {

	public A() {
		System.out.println("Parent class const");
	}

	public A(int i) {
		System.out.println("single param const");
		System.out.println("Value of i: " + i);
	}

	public A(int i, int j) {
		System.out.println("two param const");
		System.out.println("Value of i: " + i);
		System.out.println("Value of j: " + j);
	}

}
