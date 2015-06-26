package behavioral.commandpattern;

public class TVRemote {
	//TVRemote will return TV
	//DVDRemote will return DVD
	public static ElectronicDevice  getInstance(){
		return new Television();
	}
}
