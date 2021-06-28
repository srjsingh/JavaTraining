package OOPConcept_Part2;

public class BMW extends Car{ // has a relationship
 // whenever Parent and Child have method with same name and same arguments then it is called method overriding and  preference will be given to Child.
	public void start() { // Overridden method
		System.out.println("BMW--start");
	}
	
	public void theftSafety() {
		System.out.println("BMW--theftSafety");
	}

}
