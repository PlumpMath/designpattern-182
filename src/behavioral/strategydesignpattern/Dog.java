package behavioral.strategydesignpattern;

public class Dog extends Animal{
	
	public void digHole(){
		System.out.println("Dug a hole");
	}

	public Dog(){
		super();
		setSound("Bark");
		
		//setting cant fly initially
		flyingType = new CantFly();
	}
	
	//we could have overwrite the fly method
	//but we are breaking the rule
//	public void fly(){
//		Sysout("I cant fly");
//	}
	
}
