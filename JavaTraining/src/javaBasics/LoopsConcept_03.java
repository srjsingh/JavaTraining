package javaBasics;

public class LoopsConcept_03 {

	public static void main(String[] args) {

		// 1. while loop:
		// disadvantage: It will give infinite loop if incremental or decremental
		// condition is not given

		int i = 1; // initialization

		while (i <= 5) { // conditional part

			System.out.println(i);

			i = i + 1; // incremental part

		}

		System.out.println("***********************");

		// 2. for loop
		// j++ or j=j+1 is same

		for (int j = 1; j <= 5; j++) { // Initialization, Conditional and Incremental/Decremental

			System.out.println(j);

		}

		System.out.println("********************************");

		for (int k = 5; k >= 1; k--) {

			System.out.println(k);

		}

		// 3. do while loop
		int j = 1;
		do {

			System.out.println("Hello : " + j );

			j++;

		} while (j <= 10);

	}

}
