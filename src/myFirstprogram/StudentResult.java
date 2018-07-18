package myFirstprogram;

/* Method call that effects on return value*/ 

class Student{
	
  float Mark1, Mark2, Tutorial;
  float Total, GTotal;
  
 float setMark (float M1, float M2, float Tutorial)
  {
	 Mark1 = M1;
	 Mark2 = M2; 
	 this.Tutorial=Tutorial;
	 Total = Mark1 + Mark2+Tutorial;
  return(Total);
  }
 void display()  
  {
  GTotal = Tutorial + setMark (15, 15, 10);
  System.out.print("\nTutorial Mark = " + Tutorial);
  System.out.print("\nEnglish Mark = " + Mark1);
  System.out.print("\nMath Mark = " + Mark2);
  System.out.println("\nTotal = " + Total);
  System.out.print("Grand Total = " + GTotal);
  
  if (GTotal>=80)
  {
	  System.out.println("\nThe Student's Garde A");
  }
  else if (GTotal>=70 && GTotal <= 79)
  {
	  System.out.println(" \nThe Student's Garde B ");
  }
  else if (GTotal>=60 && GTotal <= 69)
  {
	  System.out.println(" \nThe Student's Garde C ");
  }
  else if (GTotal>=50 && GTotal <= 59)
  {
	  System.out.println(" \nThe Student's Garde D ");
  }
  else
  {
	  System.out.println(" \nSorry! You are Fail. Try to give the exam again");
  }
  }
 }
 public class StudentResult{
public static void main(String args[])		// throws  IOException
 {					         
 Student S = new Student();	 
											// S is an object array of Student class
 S.display(); 								// Method Call
 }
} 
