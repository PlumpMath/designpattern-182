package creational.abstractfactorypattern;

public class AbstractFactoryTesting {
	public static void main(String args[]){
		MachineFactory factory=new LowBudgetMachine();
		//MachineFactory factory=new HighBudgetMachine();
		
		ComputerShop shop=new ComputerShop(factory);
		shop.AssembleMachine();
		
	}
	
}
