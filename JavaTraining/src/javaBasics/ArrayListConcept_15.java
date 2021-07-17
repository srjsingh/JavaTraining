package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept_15 {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		
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
		
		
		// iterating array list using for loop
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		// iterating array list using iterator
		Iterator it = ar.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		
		//generics
		ArrayList<Integer> ar1 = new ArrayList();
		ar1.add(100);
		//ar1.add("Tom"); // not allowed only integer value is accepted
		
		ArrayList<String> ar2 = new ArrayList();
		ar2.add("100");
		
	}

}
