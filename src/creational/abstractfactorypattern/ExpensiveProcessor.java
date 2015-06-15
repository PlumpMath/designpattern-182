package creational.abstractfactorypattern;

public class ExpensiveProcessor implements Processor{

	@Override
	public void PerformOperation() {
		System.out.println("Operation will perform Quickly");
	}
}
