package behavioral.commandpattern;

public class TurnOff implements Command{

	ElectronicDevice device;
	
	TurnOff(ElectronicDevice device){
		this.device=device;
	}
	
	@Override
	public void execute() {
		device.off();
	}

	@Override
	public void undo() {
		device.on();
	}
}
