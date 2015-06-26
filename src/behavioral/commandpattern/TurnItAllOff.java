package behavioral.commandpattern;

import java.util.List;

public class TurnItAllOff implements Command{

	List<ElectronicDevice> devices;
	
	public TurnItAllOff(List<ElectronicDevice> devices) {
		this.devices=devices;
	}
	
	
	@Override
	public void execute() {
		for (ElectronicDevice electronicDevice : devices) {
			electronicDevice.off();
		}
	}

	@Override
	public void undo() {
		for (ElectronicDevice electronicDevice : devices) {
			electronicDevice.on();
		}
		
	}

}
