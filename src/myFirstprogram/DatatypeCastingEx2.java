package myFirstprogram;

public class DatatypeCastingEx2 {

	public DatatypeCastingEx2() {
		
	}

	public static void main(String[] args) {

		  byte x;
		 
		  int a = 270;
		  double b = 128.128;
		  
		  System.out.println("int converted to byte");
		  
		  x = (byte) a;
		  
		  System.out.println("a = " + a+" \nX= " + x);
		  
		  System.out.println("double converted to int");
		  
		  a = (int) b;
		  
		  System.out.println("b and a " + b + " " + a);
		  
		  System.out.println("\ndouble converted to byte");
		  
		  x = (byte) b;
		  
		  System.out.println("b and x " + b + " " + x);
		  
		  a=(int)x;
		  System.out.println("\nInt a=270 and in byte it is "+a);
		  
		  
		  
		
	}

}
