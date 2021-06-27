package OOPConcept_Part1;

public class LocalVSGlobalVariables {
	
	//Global vars --> class variable
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {

		int i = 10;// i is local var for main method
		System.out.println(i);
		
		LocalVSGlobalVariables obj = new LocalVSGlobalVariables();
		System.out.println(obj.age);
		System.out.println(obj.name);

	}
	
	public void sum() {
		int i = 15;// i is local varibale for sum method
		int j = 20;
		int age = 25;
	}

}
