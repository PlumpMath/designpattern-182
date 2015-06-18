package creational.prototype;

public class TestCloning {
	public static void main(String args[]){
		CloneFactory animalMaker=new CloneFactory();
		
		Sheep sally=new Sheep();
		Sheep clonedSheep=(Sheep)animalMaker.getClone(sally);
		
		System.out.println(sally);
		System.out.println(clonedSheep);
		
		System.out.println("Sally Hash Code "+System.identityHashCode(sally));
		System.out.println("Cloned Sheep Hash Code "+System.identityHashCode(clonedSheep));
		
		sally.setNoOfLegs(2);
		System.out.println(sally.getNoOfLegs());
		
		//No of Legs -- Do not change -- even though objects is copied
		//as for primitive data the block is copied
		//but for references it will be same
		System.out.println(clonedSheep.getNoOfLegs());
	}

}
