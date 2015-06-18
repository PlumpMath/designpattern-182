package structural.bridgepattern;

public abstract class EntertainmentDevice {
	
	public int deviceState;
	
	public int maxSetting;
	
	public int volumeLevel=0;
	
	public abstract void next();
	
	public abstract void previous();
	
	public abstract void deviceFeedBack();
	
	public void volumeIncrease(){
		volumeLevel++;
		System.out.println("Volume at level : "+volumeLevel);
	}

	public void volumeDecrease(){
		if(volumeLevel>0)
			volumeLevel--;
		System.out.println("Volume at level : "+volumeLevel);
	}
}
