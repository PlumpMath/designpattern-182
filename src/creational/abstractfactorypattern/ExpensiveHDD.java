package creational.abstractfactorypattern;

public class ExpensiveHDD implements HardDisk{

	@Override
	public void StoreData() {
		System.out.println("Will store data quickly");
	}
}
