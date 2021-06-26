package javaBasics;

public class ArrayConcept_04 {

	public static void main(String[] args) {
		
		// Array is used to store similar data type values in a array variable
		
		// disadvantage of array -> 
		// 1. size is fixed -> static array --> To overcome this problem we use collections -- ArrayList, HashTable --> use dynamic array
		// 2. stores only similar data type --> To overcome this problem we use object array
		
		// 1. int array
		// lowest bound/index = 0
		//upper bound/index = n-1 (n is size of array)
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[2]);
		
		//System.out.println(i[4]); // ArrayIndexOutOfBoundsException
		
		System.out.println(i.length); // size/length of array
		
		for(int j=0; j<i.length; j++) {
			
			System.out.println(i[j]);
			
		}
		
		// 2. double array
		
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		
		System.out.println(d[2]);
		
		// 3. character array
		
		char c[] = new char[3];
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'C';
		
		System.out.println(c[1]);
		
		// 4. boolean array
		
		boolean b[] = new boolean[3];
		b[0] = true;
		b[1] = false;
		
		System.out.println(b[1]);
		
		// 5. string array
		
		String s[] = new String[3];
		s[0] = "Hello";
		s[1] = "World";
		s[2] = "test";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		// 6. Object Array: (Object is a class) -- is used to store different data types values
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "27/01/1997";
		ob[4] = "M";
		ob[5] = "London";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
	}

}
