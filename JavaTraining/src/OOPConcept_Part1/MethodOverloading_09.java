package OOPConcept_Part1;

public class MethodOverloading_09 {

	public static void main(String[] args) {

		MethodOverloading_09 obj = new MethodOverloading_09();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);

	}
	
	public static void main(int i) {
		
	}
	
	public static void main(int i, int j) {
		
	}
	
	//we can overload main method also
	//you cannot create a method inside a method
	//duplicate methods -- i.e. same method name with same number of arguments are not allowed
	//method overloading --> when the method name is same with different arguments/input parameters or data type within the same class
	public void sum() { // zero input parameter
		
		System.out.println("sum method -- 1 input parameter");
		
	}
	
	public void sum(int i) { // 1 input parameter
		
		System.out.println("sum method  -- 2 input parameter");
		System.out.println(i);
		
	}
	
	public void sum(int k, int l) { // 2 input parameter
		
		System.out.println("sum method");
		System.out.println(k+l);
		
	}
	
	public void sum(String s) {
		
	}
}
