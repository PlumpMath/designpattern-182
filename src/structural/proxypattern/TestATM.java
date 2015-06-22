package structural.proxypattern;

public class TestATM {

	public static void main(String[] args) {

		ATMMachine realATMMachine=new ATMMachine();
		realATMMachine.setATMState(false);
		System.out.println(realATMMachine.getATMState());
		System.out.println(realATMMachine.getCashInMachine());
		
		GetATMState proxyATM=new ATMProxy();
		//Casting also will not work
		//((ATMMachine) proxyATM).setATMState(false);
		//There is no way we can set the values
		System.out.println(proxyATM.getATMState());
		System.out.println(proxyATM.getCashInMachine());
	}

}
