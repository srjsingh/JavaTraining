package OOPConcept_Part2;

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
		
		// Top casting
		//child class object can be referred by parent class reference variable this is known as dynamic or runtime polymorphism
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		
		//Down casting
		//BMW b1 = (BMW) new Car(); //****Class cast exception**** comes in down cating
		
	}

}
