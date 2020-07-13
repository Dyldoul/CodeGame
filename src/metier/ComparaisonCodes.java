package metier;

public class ComparaisonCodes {
	
	private int testCode;
	private int codeSecret;
	
	//Getters&Setters
	public int getTestCode() {
		return testCode;
	}
	public void setTestCode(int testCode) {
		this.testCode = testCode;
	}
	public int getCodeSecret() {
		return codeSecret;
	}
	public void setCodeSecret(int codeSecret) {
		this.codeSecret = codeSecret;
	}
	
	public void compareCode(int newTestCode, int newCodeSecret) {
		
		this.testCode = newTestCode;
		this.codeSecret = newCodeSecret;
		
		if (testCode != codeSecret) {
			
			System.out.println("Vous n'avez pas trouver le code secret");
			
		} else {
			
			System.out.println("Vous avez trouver le code secret !!!");
			
		}
		
	}
	

}
