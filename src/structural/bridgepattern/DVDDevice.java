package structural.bridgepattern;

public class DVDDevice extends EntertainmentDevice{
	
	DVDDevice(int deviceState,int maxSetting){
		this.deviceState=deviceState;
		this.maxSetting=maxSetting;
	}

	@Override
	public void next() {
		if(deviceState<maxSetting)
			deviceState++;
		System.out.println("Track at"+deviceState);
	}

	@Override
	public void previous() {
		if(deviceState>0)
			deviceState--;
		System.out.println("Track at"+deviceState);
	}

	@Override
	public void deviceFeedBack() {
		System.out.println("Track at "+ deviceState);
		System.out.println("Volume Level "+ volumeLevel);
	}
}
