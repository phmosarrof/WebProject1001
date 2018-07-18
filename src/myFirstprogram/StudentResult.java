package myFirstprogram;

/* Method call that effects on return value*/ 

class Student{
  String NameM,NameN;
  float Mark1, Mark2, Mark3, Mark4,Tutorial;
  float Total, GTotal,Total1, GTotal1;
  
  String setNameM (String Name2 )
  {
	NameM = Name2;
	 return(NameM);
  }
  
 float setMark (float M1, float M2, float Tutorial)
  {
	 Mark1 = M1;
	 Mark2 = M2; 
	 
	 this.Tutorial=Tutorial;
	 Total = Mark1 + Mark2 + Tutorial;
	 return(Total);
  }
 float setMark1 (float M3, float M4, float Tutorial)
 {
	 Mark3 = M3;
	 Mark4 = M4; 
	 
	 this.Tutorial=Tutorial;
	 Total1 = Mark3 + Mark4 + Tutorial;
	 return(Total1);
 }
 String setNameN(String Name1)
  {
	 NameN = Name1;
 
	  return(NameN);
  }
 
 void display(){
	 
  setNameM("Mosarrof Hossain");
  setNameN("Nahian Afroz");
  GTotal1 = Tutorial + setMark1 (25, 35, 10 );
  
  System.out.println("Student Name : " + NameN);
  System.out.print("Tutorial Mark = " + Tutorial);
  System.out.print("\nEnglish Mark = " + Mark3);
  System.out.print("\nMath Mark = " + Mark4);
  System.out.println("\nTotal = " + Total1);
  System.out.print("Grand Total = " + GTotal1);
  
  if (GTotal1 >=80 )
  {
	  System.out.println("\nThe Student's Garde A");
  }
  else if (GTotal1 >=70 && GTotal1 <= 79)
  {
	  System.out.println(" \nThe Student's Garde B ");
  }
  else if (GTotal1 >=60 && GTotal1 <= 69)
  {
	  System.out.println(" \nThe Student's Garde C ");
  }
  else if (GTotal1 >=50 && GTotal1 <= 59)
  {
	  System.out.println(" \nThe Student's Garde D ");
  }
  else
  {
	  System.out.println(" \nSorry! You are Fail. Try to give the exam again");
  }
  
  GTotal = Tutorial + setMark (15, 45, 10 );
  System.out.println("----------------------------------------------------------------");
  System.out.println("Student Name : " + NameM);
  System.out.print("Tutorial Mark = " + Tutorial);
  System.out.print("\nEnglish Mark = " + Mark1);
  System.out.print("\nMath Mark = " + Mark2);
  System.out.println("\nTotal = " + Total);
  System.out.print("Grand Total = " + GTotal);
  
  if (GTotal >=80)
  {
	  System.out.println("\nThe Student's Garde A");
  }
  else if (GTotal >=70 && GTotal <= 79)
  {
	  System.out.println(" \nThe Student's Garde B ");
  }
  else if (GTotal >=60 && GTotal <= 69)
  {
	  System.out.println(" \nThe Student's Garde C ");
  }
  else if (GTotal >=50 && GTotal <= 59)
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
 Student Moni = new Student();	
 
											// S is an object array of Student class
 Moni.display(); 								// Method Call
 
 }
} 
