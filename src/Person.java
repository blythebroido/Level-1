
public class Person {
	private String name;
	private String superpower;

	Person(String name, String superpower){
		this.name = name;
		this.superpower = superpower;
	}
	
	public void setName(String namo){
		name = namo;
	}
	
	public void setSuperpower(String superb){
		superpower = superb;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSuperpower(){
		return superpower;
	}
	
	public String toString(){
		return this.name + " has mad " + this.superpower + " skills"; 
	}
}

