package behavioral.commandpattern;

public class TurnOn implements Command{

	ElectronicDevice device;
	
	TurnOn(ElectronicDevice device){
		this.device=device;
	}
	
	@Override
	public void execute() {
		device.on();
	}

	@Override
	public void undo() {
		device.off();
	}
}
