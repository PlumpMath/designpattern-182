package behavioral.strategydesignpattern;

public class AnimalTest {
	
	public static void main(String args[]){
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println("Animal Sparky " + sparky.tryToFly());
		System.out.println("Animal tweety " + tweety.tryToFly());
		
		//We can use this for changing the algorithm to be used
		sparky.setFlyingAbility(new CanFly());
		System.out.println("Animal Sparky " + sparky.tryToFly());
	}
}
