package ExceptionHandlingConcept;

public class ThrowKeyword {

	public static void main(String[] args) {

		// Throw is used when we want to throw our custom exception

		System.out.println("ABC");

		try {

			throw new Exception("Suraj Exception");

		} catch (Exception e) {

			e.printStackTrace();

		}

		System.out.println("SUR");

	}

}
