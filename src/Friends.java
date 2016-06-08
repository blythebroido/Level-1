public class Friends {


	public static void main(String[] args){
    	//3. Create an instance of Classmate for each person in your class.
   	 Classmate betsy = new Classmate();
   	 Classmate scott = new Classmate();
    	//4. set descriptions for each Classmate
   	 betsy.setDescription("betsy-y");
   	 scott.setDescription("scott-y"); 
   	 //5. Use your getter to print out each description
   	 System.out.println(betsy.getDescription());
   	System.out.println(scott.getDescription());
   	
	}





}
class Classmate{
	String description;
    
	//1. create a setter that sets a description for this person
void setDescription(String description){
	this.description = description;
}
	//2. create a getter that gets a description of this person
String getDescription(){
	return description;
}
}


