package behavioral.commandpattern;

public class TurnVolumeUp implements Command{

	ElectronicDevice device;
	
	TurnVolumeUp(ElectronicDevice device){
		this.device=device;
	}
	
	@Override
	public void execute() {
		device.volumeUp();
	}

	@Override
	public void undo() {
		device.volumeDown();
	}
}
