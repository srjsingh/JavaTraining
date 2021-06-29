package javaBasics;

import java.util.Hashtable;

public class HashTableConcept_15 {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		System.out.println(h.size());
		
		System.out.println(h.get("C"));
		
		Hashtable<Integer, Integer> h1 = new Hashtable<>();
		
		h1.put(1, 200);
		//h1.put("A", 100);
		
		Hashtable<Integer, String> h2 = new Hashtable<>();
		h2.put(2, "Suraj");
		
	}

}
