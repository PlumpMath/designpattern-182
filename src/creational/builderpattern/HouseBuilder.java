package creational.builderpattern;

public interface HouseBuilder {
	
	public void buildFloor();
	public void buildRoof();
	public void buildWall();
	public House getHouse();

}
