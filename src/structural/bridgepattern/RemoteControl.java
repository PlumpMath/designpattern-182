package structural.bridgepattern;

public abstract class RemoteControl {
	
	protected EntertainmentDevice device;
	
	RemoteControl(EntertainmentDevice device){
		this.device=device;
	}
	
	public void buttonUpPressed(){
		device.volumeIncrease();
	}

	public void buttonDownPressed(){
		device.volumeDecrease();
	}
	
	public void buttonLeftPressed(){
		device.previous();
	}
	
	public void buttonRightPressed(){
		device.next();
	}
	public abstract void buttonMiddlePressed();
}
