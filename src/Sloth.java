
public class Sloth {
	String color;
	String home;
	int toes;

	Sloth(String color, String home, int toes) {
		this.color = color;
		this.home = home;
		this.toes = toes;
	}
	void sleeping (){
		System.out.println("A "+this.color+" sloth is sleeping in its "+this.home+" with its "+this.toes+" toes.");
		
	}
}