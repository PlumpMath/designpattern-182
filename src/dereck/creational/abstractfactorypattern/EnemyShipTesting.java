package dereck.creational.abstractfactorypattern;

public class EnemyShipTesting {
	
	public static void main(String args[]){
		EnemyShipBuilding MakeUFOs=new UFOEnemyShipBuilding();

		EnemyShip theGrunt=MakeUFOs.orderTheShip("UFO");
		System.out.println(theGrunt);
		
//		EnemyShip theBoss=MakeUFOs.orderTheShip("UFO BOSS");
//		System.out.println(theBoss);
		
		EnemyShipBuilding MakeRockets=new RocketEnemyShipBuilding();
		EnemyShip theRocket=MakeRockets.orderTheShip("ROCKET");
		System.out.println(theRocket);
	}

}
