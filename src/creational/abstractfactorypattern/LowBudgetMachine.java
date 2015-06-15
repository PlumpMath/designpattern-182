package creational.abstractfactorypattern;

public class LowBudgetMachine implements MachineFactory{

	@Override
	public Processor getRam() {
		return new CheapProcessor();
	}

	@Override
	public Monitor getMonitor() {
		return new LowResolutionMonitor();
	}

	@Override
	public HardDisk getHardDisk() {
		return new CheapHDD();
	}

}
