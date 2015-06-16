package creational.builderpattern;

public class WoodBuilder implements HouseBuilder{
	
	private House house;
	
	public WoodBuilder(){
		house=new House();
	}

	@Override
	public void buildFloor(){
		house.setFloor(new WoodFloor());
	}
	
	@Override
	public void buildRoof(){
		house.setRoof(new WoodRoof());
	}
	
	@Override
	public void buildWall(){
		house.setWall(new WoodWall());
	}

	@Override
	public House getHouse() {
		return this.house;
	}
}
