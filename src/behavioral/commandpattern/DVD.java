package behavioral.commandpattern;

public class DVD implements ElectronicDevice {

	private int volume=0;
	
	@Override
	public void on() {
		System.out.println("DVD is On");
	}

	@Override
	public void off() {
		System.out.println("DVD is Off");
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("DVD Volume is at : "+volume);
		
	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("DVD Volume is at : "+volume);
	}
}
