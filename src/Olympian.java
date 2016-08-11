
public class Olympian {
	String country;
	String name;
	int age;
	int olympianNumber;
	static int number = 0;
	
	public Olympian (String country, String name, int age){
		this.country = country;
		this.name = name;
		this.age = age;
		number += 1;
		olympianNumber =  number;
	}
	
	void compete(){
		System.out.println(name + " is " + age + " years old " + " and at one point competed for " 
	+ country + ", and your number is " + olympianNumber + ".");
	}
}
