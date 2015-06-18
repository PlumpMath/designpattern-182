package structural.bridgepattern;

public class BridgePatternTest {
	
	public static void main(String args[]){
	EntertainmentDevice dvdDevice=new DVDDevice(0, 10);
	EntertainmentDevice tvDevice=new TVDevice(0, 100);
	
	RemoteControl remote1=new AdvancedRemoteControlOne(tvDevice);
	RemoteControl remote2=new AdvancedRemoteControlTwo(dvdDevice);
	
	remote1.buttonUpPressed();
	remote1.buttonDownPressed();
	remote1.buttonRightPressed();
	remote1.buttonLeftPressed();
	remote1.buttonMiddlePressed();
	
	remote2.buttonUpPressed();
	remote2.buttonDownPressed();
	remote2.buttonRightPressed();
	remote2.buttonLeftPressed();
	remote2.buttonMiddlePressed();
	}
}
