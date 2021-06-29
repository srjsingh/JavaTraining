package OOPConcept_Part2.InterfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.carLoan();
		hs.educationLoan();
		
		//dynamic polymorphism
		// child class object can be referred by parent class object reference variable
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		// only overridden method can be called
	}

}
