package dereck.creational.abstractfactorypattern;

public class RocketEnemyShip extends EnemyShip {

	EnemyShipFactory shipFactory;
	public RocketEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory=shipFactory;
	}

	@Override
	void makeShip() {
		System.out.println( "Making enemy ship " + getName());
		weapon =shipFactory.addESGun();
		engine =shipFactory.addESEngine();
	}

}
