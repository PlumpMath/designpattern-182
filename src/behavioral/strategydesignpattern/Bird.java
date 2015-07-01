package behavioral.strategydesignpattern;

public class Bird extends Animal{
	
	public void digHole(){
		System.out.println("Dug a hole");
	}

	public Bird(){
		super();
		setSound("Tweet");
		
		//setting cant fly initially
		flyingType = new CanFly();
	}
	
	//we could have overwrite the fly method
	//but we are breaking the rule
//	public void fly(){
//		Sysout("I cant fly");
//	}
	
}
