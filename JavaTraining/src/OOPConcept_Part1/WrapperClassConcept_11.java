package OOPConcept_Part1;

public class WrapperClassConcept_11 {

	public static void main(String[] args) {
		
		//Wrapper class is used for type casting
		
		String x = "100";
		System.out.println(x+20);
		
		//data conversion: String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Boolean
		
		//data conversion: String to double
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//data conversion: String to boolean
		String z = "true";
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		//data conversion: integer to string
		int j = 20;
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		//data conversion: not pure string value
		String k = "200A";
		int l = Integer.parseInt(k); //NumberFormatException: For input string: "200A"

	}

}
