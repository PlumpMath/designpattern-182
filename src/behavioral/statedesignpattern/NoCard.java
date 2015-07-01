package behavioral.statedesignpattern;

public class NoCard implements ATMState {

	ATMMachine atmMachine;
	
	public NoCard(ATMMachine atmMachine) {
		this.atmMachine=atmMachine;
		
	}

	@Override
	public void insertCard() {
		System.out.println("Please enter a Pin");
		atmMachine.setATMState(atmMachine.getYesCardState());
	}

	@Override
	public void ejectCard() {
		System.out.println("Enter a card first.");

	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("Enter a card first.");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("Enter a card first.");
	}

}
