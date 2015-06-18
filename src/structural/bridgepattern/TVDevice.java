package structural.bridgepattern;

public class TVDevice extends EntertainmentDevice{
	
	TVDevice(int deviceState,int maxSetting){
		this.deviceState=deviceState;
		this.maxSetting=maxSetting;
	}

	@Override
	public void next() {
		if(deviceState<maxSetting)
			deviceState++;
		
		System.out.println("Channel at"+deviceState);
			
	}

	@Override
	public void previous() {
		if(deviceState>0)
			deviceState--;
		System.out.println("Channel at"+deviceState);
	}
	
	public void deviceFeedBack(){
		System.out.println("Channel at "+ deviceState);
		System.out.println("Volume Level "+ volumeLevel);
	}
}
