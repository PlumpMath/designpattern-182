package creational.abstractfactorypattern;

public class CheapHDD implements HardDisk{

	@Override
	public void StoreData() {
		System.out.println("Will store data slowly");
	}
}
