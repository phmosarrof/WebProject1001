package myFirstprogram;

class Human {
		
	char gender;
	int age;
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
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
		
		((Human) mahdi).setAge(25);
		
		((Human) munim).setAge(15);
		((Human) munim).setGender('M');
		((Human) mahdi).setGender('M');
		
		System.out.println("Mahdi's Age = " + mahdi.getAge());
		System.out.println("Munim's Age = " + munim.getAge());
		System.out.println("Munim's Gender = " + munim.getGender());
		System.out.println("Mahdi's Gender = " + mahdi.getGender());
	
		
	}

}
