package OOPConcept_Part1;

public class CallByValueAndCallByReference {

	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x = 10;
		int y = 20;
		obj.testSum(x, y); //call by value or pass by value --> copy of variable value is passed

		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	//Call by value
	public int testSum(int a, int b) {
		a = 30;
		b = 40; // value of x and y will not be effected
		int c = a+b;
		return c;
		
	}
	
	// call by reference --> we pass reference as an argument
	public void swap(CallByValueAndCallByReference t) {
		
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		
	}
	
}
