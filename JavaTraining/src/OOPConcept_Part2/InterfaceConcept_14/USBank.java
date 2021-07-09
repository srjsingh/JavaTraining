package OOPConcept_Part2.InterfaceConcept_14;

public interface USBank {

	int minBal = 100;

	public void credit();

	public void debit();

	public void transferMoney();

	// only method declaration
	// no method body - only method prototype
	// in interface we can declare the variables, vars are by default static in
	// nature
	// vars value will not be changed, its constant in nature
	// no static methods in interface
	// no main method in interface
	// we cannot create the object of interface
	// Interface is abstract in nature
}
