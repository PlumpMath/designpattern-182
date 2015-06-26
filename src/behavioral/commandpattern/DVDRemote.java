package behavioral.commandpattern;

public class DVDRemote {
	//TVRemote will return TV
	//DVDRemote will return DVD
	public static ElectronicDevice  getInstance(){
		return new DVD();
	}
}
