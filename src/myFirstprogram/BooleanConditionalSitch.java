package myFirstprogram;

public class BooleanConditionalSitch {

	public BooleanConditionalSitch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ( 3 >= 3 && !(true || true) )
		boolean Dream = false;	
	    
	System.out.println(Dream);
	
		if(2016 < 2015) {

				System.out.println("Need more practiec");

			}else {

				System.out.println("Upgraded to the future!");

			}
		

		int subwayTrain = 5;

			switch (subwayTrain){

				case 1 : System.out.println("This is a South Ferry bound train!");
									break; 
				case 5 : System.out.println("This is a Brooklyn bound train!");
									break;
				case 7 : System.out.println("This is a Queens bound train!");
									break;
				default:
					System.out.println("I'm not sure where that train goes...");
		
			}

	}

}
