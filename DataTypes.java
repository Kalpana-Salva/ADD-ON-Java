package basic.concepts;

public class DataTypes {

	public static void main(String[] args) {
		//Non-primitive DataType
		String name = "ABC./@12344";
		
		System.out.println("String Representing:"+ name);
		System.out.println("String Representing:"+ name.length());
		System.out.println("String Representing:"+ name.toLowerCase());
		
    	//Primitive Data Types
		//1. Number Type
		byte age = (byte) 130;
		short b = 32_767;
		int c = 2_147_483_647;
		long d = 9_223_372_036_854_775_807L;
		
		
		//Float Type
		float e = 1.123456789f;//6 digit precision
		double f = 1.1234567891011245;//16 digit precision
		
		//Boolean type
		boolean status = true;
		
		//char type
		char initial = 'R';
		
		
		
		//display output
		System.out.println("Type Representing:"+ age);
		System.out.println("short Representing:"+ b);
		System.out.println("int Representing:"+ c);
		System.out.println("long Representing:"+ d);
		
		System.out.println("float Representing:"+ e);
		System.out.println("double Representing:"+ f);
		System.out.println("boolean Representing:"+ status);
		System.out.println("char Representing:"+ initial); 
	
	}
	

}
