package dereck.creational.abstractfactorypattern;

public class RocketEnemyShipBuilding extends EnemyShipBuilding {

	@Override
	protected EnemyShip makeEnemyShip(String typeOfShip) {
		EnemyShip theEnemyShip=null;
		if(typeOfShip.equals("ROCKET")){
			EnemyShipFactory shipPartsFactory=new RocketEnemyShipFactory();
			theEnemyShip=new RocketEnemyShip(shipPartsFactory);
			theEnemyShip.setName("Rocket Grunt Ship");
		}
		return theEnemyShip;
	}

}
