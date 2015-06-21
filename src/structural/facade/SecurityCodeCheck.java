package structural.facade;

public class SecurityCodeCheck {
	
	private int securityCode=123;
	
	public int getSecurityCode(){
		return securityCode;
	}

	public boolean accountActive(int securiytCodeToCheck){
		if(securiytCodeToCheck==getSecurityCode()){
			return true;
		}else{
			System.out.println("Security Code Mismatch");
			return false;
		}
	}
}
