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
		System.out.println("\n1. Output = " +output);
		System.out.println("\n2. Output = " +(a>b));
		System.out.println("\n3. Output = " +(a<b));
		System.out.println("\n4. Output = " +(a>c));
		System.out.println("\n5. Output = " +(a<c));
		System.out.println("\n6. Output = " +(b>a));
		System.out.println("\n7. Output = " +(b>c));
		System.out.println("\n8. Output = " +(b<a));
		System.out.println("\n9. Output = " +(b<c));
		System.out.println("\n10. Output = " +(c>b));
		System.out.println("\n11. Output = " +(c>a));
		System.out.println("\n12. Output = " +(c<b));
		System.out.println("\n13. Output = " +(c<a));
		
	}

}
