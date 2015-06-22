package structural.proxypattern;

public class ATMProxy implements GetATMState{

	@Override
	public String getATMState() {
		ATMMachine realATM=new ATMMachine();
		return realATM.getATMState();
	}

	@Override
	public int getCashInMachine() {
		ATMMachine realATM=new ATMMachine();
		return realATM.getCashInMachine();
	}
}
