
public class JamesBond {
	Vault v = new Vault();
	
	int findCode(Vault v){
		for (int i = 0; i < 1000001; i++) {
			boolean whatIsCode = v.tryCode(i);
			if(whatIsCode){
				return i;
			}

		}
		return -1;
		
	}
}
