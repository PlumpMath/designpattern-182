package creational.abstractfactorypattern;

public class CheapProcessor implements Processor{

	@Override
	public void PerformOperation() {
		System.out.println("Operation will perform quickly");
	}
}
