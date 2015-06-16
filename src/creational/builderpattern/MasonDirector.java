package creational.builderpattern;

public class MasonDirector {
	
	private HouseBuilder houseBuilder;
	
	public MasonDirector(HouseBuilder houseBuilder){
		this.houseBuilder=houseBuilder;
	}

	public House getHouse(){
		return houseBuilder.getHouse();
	}
	
	public void buildHouse(){
		houseBuilder.buildFloor();
		houseBuilder.buildWall();
		houseBuilder.buildRoof();
	}
}
