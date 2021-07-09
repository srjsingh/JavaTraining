package ExceptionHandlingConcept;

public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException{

		ThrowsKeyword obj = new ThrowsKeyword();

		obj.sum();
		System.out.println("ABC");
		

	}

	public void sum() throws ArithmeticException{ // throws is used when method chaining is used and it can't print message

		try {
			
			div();
			
		} catch (Throwable e) { // throwable is super class of all error and exception
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}

	}

	public void div() throws ArithmeticException{

		int i = 9 / 0; //exception line

	}

}
