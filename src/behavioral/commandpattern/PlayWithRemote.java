package behavioral.commandpattern;

import java.util.LinkedList;
import java.util.List;

public class PlayWithRemote {

	public static void main(String[] args) {
		
		ElectronicDevice TV=TVRemote.getInstance();
		ElectronicDevice DVD=DVDRemote.getInstance();
		
		TurnOn onCommandTV=new TurnOn(TV);
		
		DeviceButton button=new DeviceButton(onCommandTV);
		button.press();
		
		//For a command object - receiver object is required - aggregation
		//DVD used over here
		//TurnOn is command
		//For each method one command is present
		TurnOn onCommandDVD=new TurnOn(DVD);
		
		//onButtonDVD is invoker which calls press and then method of execute is called
		button=new DeviceButton(onCommandDVD);
		button.press();
		
		button.undoPress();
		
		TurnVolumeUp volUpCmdTV=new TurnVolumeUp(TV);
		button=new DeviceButton(volUpCmdTV);
		button.press();
		button.press();
		button.press();
		button.press();
		button.undoPress();
		
		
		//Turning everything as off
		Television tv1=new Television();
		DVD dvd1=new DVD();
		
		List<ElectronicDevice> devices=new LinkedList<ElectronicDevice>();
		devices.add(tv1);
		devices.add(dvd1);
		TurnItAllOff allOffCmd=new TurnItAllOff(devices);
		//we can do allOffCmd execute -- but going through device button
		DeviceButton buttonAllOff=new DeviceButton(allOffCmd);
		buttonAllOff.press();
		//buttonAllOff.undoPress();
	}
}
