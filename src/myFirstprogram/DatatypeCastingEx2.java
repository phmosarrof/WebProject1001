package myFirstprogram;

public class DatatypeCastingEx2 {

	public DatatypeCastingEx2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  byte x;
		  int a = 270;
		  double b = 128.128;
		  
		  System.out.println("int converted to byte");
		  
		  x = (byte) a;
		  
		  System.out.println("a and x " + a+" " + x);
		  
		  System.out.println("double converted to int");
		  
		  a = (int) b;
		  
		  System.out.println("b and a " + b + " " + a);
		  
		  System.out.println("\ndouble converted to byte");
		  
		  x = (byte) b;
		  
		  System.out.println("b and x " + b + " " + x);
		
	}

}
