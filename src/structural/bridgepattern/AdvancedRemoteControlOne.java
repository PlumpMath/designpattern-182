package structural.bridgepattern;

public class AdvancedRemoteControlOne extends RemoteControl{

	AdvancedRemoteControlOne(EntertainmentDevice device) {
		super(device);
	}
	
	public void buttonMiddlePressed(){
		System.out.println("Do some unrelated work wrt to TV");
		//Eg some remote have Weather Information
	}
}
