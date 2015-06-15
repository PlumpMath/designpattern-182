package dereck.creational.abstractfactorypattern;

public class UFOBossEnemyShip extends EnemyShip {

	EnemyShipFactory shipFactory;
	public UFOBossEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory=shipFactory;
	}

	@Override
	void makeShip() {
		System.out.println("Making an enemy ship "+ getName());
		weapon=shipFactory.addESGun();
		engine=shipFactory.addESEngine();
		
	}

}
 