import java.util.Random;

public class Vault {
	int secretCode;
	Vault(){
		this.secretCode = new Random().nextInt(1000001);
	}
	Vault(int c){
		this.secretCode = c;
	}

	public static void main(String[] args) {
Vault vault = new Vault();

	}
	 boolean tryCode(int code){
		if(code == secretCode){
			return true;
		}
		else{
		return false;
		}
	}
}
