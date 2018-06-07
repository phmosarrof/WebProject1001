package myFirstprogram;

public class IntegerExchange1 {

	public IntegerExchange1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 30;
		int Monir=a, Kobir=b;
		
		char Manik = (a>10) ? 'Y' : 'N'; // Terrnay Boolean conditional
				
		String A ="a";
		System.out.println("Mark of Monir "+Monir*100);
		System.out.println("Mark of Kobir "+Kobir*100);
		System.out.println("Mark of A "+Monir*100);
		System.out.println(2>1 && 3<5);
		System.out.println(2>1 || 3<5);
		System.out.println(!(2>1) && 3<5);
		System.out.println(2>1 && 3<5);
		System.out.println(!(2>1) || (2>1 && 3<5));
		System.out.println("Terrnay Condition: "+Manik);
		
		
		
	}

}
