package creational.abstractfactorypattern;

public class HighResolutionMonitor implements Monitor{

	@Override
	public void DisplayPicture() {
		System.out.println("Picture Quality - Best");
	}
}
