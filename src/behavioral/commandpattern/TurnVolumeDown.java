package behavioral.commandpattern;

public class TurnVolumeDown implements Command{

	ElectronicDevice device;
	
	TurnVolumeDown(ElectronicDevice device){
		this.device=device;
	}
	
	@Override
	public void execute() {
		device.volumeDown();
	}

	@Override
	public void undo() {
		device.volumeUp();
	}
}
