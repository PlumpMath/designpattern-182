package creational.abstractfactorypattern;

public class HighBudgetMachine implements MachineFactory{

	@Override
	public Processor getRam() {
		return new ExpensiveProcessor();
	}

	@Override
	public Monitor getMonitor() {
		return new HighResolutionMonitor();
	}

	@Override
	public HardDisk getHardDisk() {
		return new ExpensiveHDD();
	}
}