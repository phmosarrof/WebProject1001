package myFirstprogram;

public class Relationaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		boolean output;
		
		a = 90;
		b = 90;
		c = 100;
		output = b<a;
		System.out.println("\nOutput = " +output);
		System.out.println("\nOutput = " +(a>b));
		System.out.println("\nOutput = " +(a<b));
		System.out.println("\nOutput = " +(a>c));
		System.out.println("\nOutput = " +(a<c));
		System.out.println("\nOutput = " +(b>a));
		System.out.println("\nOutput = " +(b>c));
		System.out.println("\nOutput = " +(b<a));
		System.out.println("\nOutput = " +(b<c));
		System.out.println("\nOutput = " +(c>b));
		System.out.println("\nOutput = " +(c>a));
		System.out.println("\nOutput = " +(c<b));
		System.out.println("\nOutput = " +(c<a));
		
	}

}
