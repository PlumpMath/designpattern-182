package creational.abstractfactorypattern;

public class LowResolutionMonitor implements Monitor{

	@Override
	public void DisplayPicture() {
		System.out.println("Picture quality - Bad");
	}
}
