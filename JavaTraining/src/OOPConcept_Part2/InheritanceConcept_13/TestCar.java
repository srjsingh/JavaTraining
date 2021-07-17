package OOPConcept_Part2.InheritanceConcept_13;

public class TestCar {

	public static void main(String[] args) {
		
		// Static or compile time polymorphism
		BMW b = new BMW();
		b.start(); // Overridden method
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		// Top casting
		//child class object can be referred by parent class reference variable this is known as dynamic or runtime polymorphism
		Car c1 = new BMW();
		c1.start(); // preference will be given to child class method
		c1.stop();
		c1.refuel();
		
		
		//Down casting
		//BMW b1 = (BMW) new Car(); //****Class cast exception**** comes in down casting
		
	}

}
