package creational.abstractfactorypattern;

public class ComputerShop {
	MachineFactory category;
	
	public ComputerShop(MachineFactory category){
		this.category=category;
	}
	
	public void AssembleMachine(){
		Processor processor=category.getRam();
		HardDisk hdd=category.getHardDisk();
		Monitor monitor=category.getMonitor();
		
		processor.PerformOperation();
		hdd.StoreData();
		monitor.DisplayPicture();
	}

}
