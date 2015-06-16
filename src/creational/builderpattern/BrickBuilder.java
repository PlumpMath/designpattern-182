package creational.builderpattern;

public class BrickBuilder implements HouseBuilder{
	
	private House house;
	
	public BrickBuilder(){
		house=new House();
	}

	@Override
	public void buildFloor(){
		house.setFloor(new BrickFloor());
	}
	
	@Override
	public void buildRoof(){
		house.setRoof(new BrickRoof());
	}
	
	@Override
	public void buildWall(){
		house.setWall(new BrickWall());
	}

	@Override
	public House getHouse() {
		return this.house;
	}
}
