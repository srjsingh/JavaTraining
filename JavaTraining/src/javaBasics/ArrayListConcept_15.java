package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept_15 {

	public static void main(String[] args) {

		ArrayList ar =new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add(26.33);
		ar.add("M");
		
		
		System.out.println(ar.size());
		
		ar.remove(5);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(3));
		
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList();
		ar1.add(100);
		//ar1.add("Tom"); // not allowed only integer value is accepted
		
		ArrayList<String> ar2 = new ArrayList();
		ar2.add("100");
		
	}

}
