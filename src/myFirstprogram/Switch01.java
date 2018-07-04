package myFirstprogram;

public class Switch01 {

	public Switch01() {
		
	}
	public static void main(String args[]) {
		
		// int messi = 10;
		
		int messi ='D';
		//char Moni = 'D';
		switch (messi) {

			case 'A': System.out.println("Messi shoots to the left and scores!");
								break; 
			case 'R': System.out.println("Messi shoots to the right and misses the goal!");
								break;
			case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
								break;
			case 'D': System.out.println(" Messi is all rounder player");
								break;
			default:
				System.out.println(" Messi is in position...");

		}
	}

}
