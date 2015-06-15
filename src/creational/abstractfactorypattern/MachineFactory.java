package creational.abstractfactorypattern;

public interface MachineFactory {
	Processor getRam();
	Monitor getMonitor();
	HardDisk getHardDisk();
}
