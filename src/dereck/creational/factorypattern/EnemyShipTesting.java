package dereck.creational.factorypattern;
import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		
		EnemyShipFactory shipFactory=new EnemyShipFactory();
		
		Scanner userInput=new Scanner(System.in);
		String enemyShipOption="";
		System.out.println("What type of ship?(U/R/B)?");
		if(userInput.hasNextLine())
			enemyShipOption=userInput.nextLine();
		
		EnemyShip enemyShip=shipFactory.makeEnemyShip(enemyShipOption);
		doStuff(enemyShip);
	}
	
	public static void doStuff(EnemyShip anEnemyShip){
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}

}
