package myFirstprogram;

public class IfCondition1 {

	public IfCondition1() {
		
	}

	public static void main(String[] args) {
		
		int a, b, c ;
		a = 50;
		b = 200;
		c = 100;
		
		if (a>b && a>c)
		{
			System.out.println("A is greater than B and C.");
		}
		
		else if(b>a && b>c)
		
		{
			System.out.println("B is greater than A and C");
		}
		
		else
		
		{
			System.out.println("A is not greater than B and C");
		}
	}

}
