package myFirstprogram;

public class Human {
	
	String Name;	
	char gender; 			// Member Variable declare.
	int age;
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public char getGender() { // Member function declare.
		return gender;
	}
	public void setGender(char gender) { // Method
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	public static void main(String[] args) {
		
		Human mahdi = new Human();
		Human munim = new Human();
		
		((Human) mahdi).setName("Mahdi Islam");
		((Human) munim).setName("Munium Islam");
		
		mahdi.setAge(25);
		munim.setAge(15);
		
		((Human) munim).setGender('M');
		((Human) mahdi).setGender('M');
		
		
		System.out.println("Mahdi's Full Name = "+ mahdi.getName());
		System.out.println("Mahdi's Gender = " + mahdi.getGender());
		System.out.println("Mahdi's Age = " + mahdi.getAge());
		System.out.println("Munim's Full Name = "+ munim.getName());
		System.out.println("Munim's Gender = " + munim.getGender());
		System.out.println("Munim's Age = " + munim.getAge());
	}

}
