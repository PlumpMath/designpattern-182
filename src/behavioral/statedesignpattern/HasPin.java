package behavioral.statedesignpattern;

public class HasPin implements ATMState {

	ATMMachine atmMachine;
	
	public HasPin(ATMMachine atmMachine) {
		this.atmMachine=atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("You can't enter more than one card");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("Already entered pin");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		if(cashToWithdraw>atmMachine.cashInMachine){
			System.out.println("Don't have enough cash");
			System.out.println("Card ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}else{
			System.out.println("Please collect the cash"+cashToWithdraw);
			atmMachine.setCashInMachine(atmMachine.cashInMachine-cashToWithdraw);
			System.out.println("Card ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
			if(atmMachine.cashInMachine<=0){
				atmMachine.setATMState(atmMachine.getNoCashState());
			}
		}
			
	}

}
