package behavioral.statedesignpattern;

public class TestATMMachine {

	public static void main(String[] args) {
		
		ATMMachine atmMachine = new ATMMachine();
		atmMachine.insertCard();
		atmMachine.ejectCard();
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
		atmMachine.requestCash(200);
		atmMachine.insertCard();
		atmMachine.insertPin(6789);
		atmMachine.requestCash(235);

	}

}
