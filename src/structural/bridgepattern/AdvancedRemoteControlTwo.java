package structural.bridgepattern;

public class AdvancedRemoteControlTwo extends RemoteControl{

	AdvancedRemoteControlTwo(EntertainmentDevice device) {
		super(device);
	}
	
	public void buttonMiddlePressed(){
		//we can do some related work with TV also
		//Like showing guide or Showing current status of channel and volume
		super.device.deviceFeedBack();
		//Eg some remote have Weather Information
	}
}
