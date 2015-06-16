package creational.builderpattern;

public class HouseTest {

	public static void main(String[] args) {
		
		HouseBuilder brickBuilder=new BrickBuilder();
		
		MasonDirector masonBrick=new MasonDirector(brickBuilder);
		masonBrick.buildHouse();
		
		House house1=masonBrick.getHouse();
		//Both will correspond to same house
		//To make a new house we need to make new BrickBuilder and MasonDirector
		House house2=masonBrick.getHouse();
		System.out.println("Floor :" + house1.getFloor().getRepresentation());
		System.out.println("Roof :" + house1.getRoof().getRepresentation());
		System.out.println("Wall :" + house1.getWall().getRepresentation());
		
		//for changing the floor if we want
		house1.setFloor(new WoodFloor());
		System.out.println("Floor :" + house1.getFloor().getRepresentation());
		System.out.println("Roof :" + house1.getRoof().getRepresentation());
		System.out.println("Wall :" + house1.getWall().getRepresentation());
		
	}

}
