package behavioral.statedesignpattern;

public class HasCard implements ATMState {

	//we need to store the context 
	//Actual object we will be working with == ATMMachine
	ATMMachine atmMachine;
	
	public HasCard(ATMMachine atmMachine) {
		this.atmMachine=atmMachine;
	}

	@Override
	//We already have a card
	public void insertCard() {
		System.out.println("You can't enter more than one card");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected");
		//As we dont have the card -- we need to change the state of ATM Machine
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) {
		if(pinEntered ==1234){
			System.out.println("Correct Pin");
			atmMachine.correctPinEntered=true;
			atmMachine.setATMState(atmMachine.getHasPin());
		}else{
			System.out.println("Wrong Pin");
			atmMachine.correctPinEntered=false;
			System.out.println("Card Ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("Enter Pin First");
	}

}
