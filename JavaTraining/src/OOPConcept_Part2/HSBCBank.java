package OOPConcept_Part2;

//to define relation between interface and class implements is used
public class HSBCBank implements USBank, BrazilBank{ // implementing multiple inheritance
	//Is a relationship
	
	// If a class is implementing any Interface, then it's mandatory to define/override all methods of interface
	//Overriding USBank 
	public void credit() {
		System.out.println("hsbc--credit");
	}
	
	public void debit() {
		System.out.println("hsbc--debit");		
	}
	
	public void transferMoney() {
		System.out.println("hsbc--tansferMoney");
	}
	
	//separate methods of HSBCBank
	public void educationLoan() {
		System.out.println("hsbc--educationLoan");
	}
	
	public void carLoan() {
		System.out.println("hsbc--carLoan");
	}
	
	//Brazil bank method
	public void mutualFund() {
		System.out.println("hsbc--mutualFund");
	}

}
