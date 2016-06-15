
public class CodeCracker {
	public static void main(String[] args) {
		Vault vault = new Vault(-2);
		JamesBond james = new JamesBond();
		int realCode = james.findCode(vault);
		if(realCode == -1){
			System.out.println("The code is not crackable!");
		}
		else{
		System.out.println(realCode);
		}

			}
}
