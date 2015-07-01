package behavioral.statedesignpattern;

public class ATMMachine {

	//Context class - actual object class
	//with whom we will be working
	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;
	
	//Holds current state
	ATMState atmState;
	
	int cashInMachine=2000;
	boolean correctPinEntered=false;
	
	public ATMMachine(){
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);
		
		//initial state - so no card in it
		atmState = noCard;
		
		if(cashInMachine<0)
			atmState = atmOutOfMoney;
	}
	
	void setATMState(ATMState atmState){
		this.atmState=atmState;
	}
	
	public void setCashInMachine(int cashInMachine){
		this.cashInMachine=cashInMachine;
	}
	
	public void insertCard(){
		atmState.insertCard();
	}
	
	public void ejectCard(){
		atmState.ejectCard();
	}
	
	public void insertPin(int pinEntered){
		atmState.insertPin(pinEntered);
	}
	
	public void requestCash(int cashToWithdraw){
		atmState.requestCash(cashToWithdraw);
	}
	
	public ATMState getYesCardState(){
		return hasCard;
	}
	
	public ATMState getNoCardState(){
		return noCard;
	}
	
	public ATMState getHasPin(){
		return hasCorrectPin;
	}
	
	public ATMState getNoCashState(){
		return atmOutOfMoney;
	}
}
