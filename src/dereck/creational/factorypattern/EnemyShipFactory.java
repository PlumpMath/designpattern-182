package dereck.creational.factorypattern;

public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String shipType){
		switch (shipType.toLowerCase()) {
		case "u":
			return new UFOEnemyShip();
		case "r":
			return new RocketEnemyShip();
		case "b":
			return new BossUFOEnemyShip();
		default:
			throw new IllegalArgumentException("Argument should be U/R/B");
		}
	}
}
