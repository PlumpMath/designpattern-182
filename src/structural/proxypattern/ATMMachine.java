package structural.proxypattern;

public class ATMMachine implements GetATMState{

	private boolean isWorking=true;
	private int cashInMachine=1000;
	
	@Override
	public String getATMState() {
		return "ATM is working : " + isWorking;
	}
	
	public void setATMState(boolean isWorking) {
		this.isWorking=isWorking;
	}

	@Override
	public int getCashInMachine() {
		return cashInMachine;
	}
	
	public void setCashInMachine(int cashInMachine){
		this.cashInMachine=cashInMachine;
	}
}
