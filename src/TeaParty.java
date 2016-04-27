
public class TeaParty {
	
	public static void main(String[] args) {
		
	}
	
	public String welcome(String name, boolean isWomen, boolean knighted){
		String title;
		if(isWomen){
			title = "Ms. ";
		}
		else if(knighted){
			title = "Sir ";
		}
		else{
			title = "Mr. ";
		}
		
		
		return "Hello " + title + name;
	}
}
