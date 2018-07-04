package myFirstprogram;

public class DoWhile01 {

	public DoWhile01() {
		
	}

	public static void main(String[] args) {
		
		
		 int arr[]={0,2,4,6,8,10,12,14,15};
		 
         // i starts with 0 as array index starts with 0
		 // zazakallah khairan == o yia khum
		 
         int i = 0;
         do {
              System.out.print(arr[i]+", ");
              i++;
         } while (i<12);
	}

}
