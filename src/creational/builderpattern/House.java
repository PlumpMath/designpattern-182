package creational.builderpattern;

public class House implements HousePlan{

	private Floor floor;
	private Roof roof;
	private Wall wall;
	@Override
	public void setFloor(Floor floor) {
		this.floor=floor;
	}

	@Override
	public void setRoof(Roof roof) {
		this.roof=roof;
	}

	@Override
	public void setWall(Wall wall) {
		this.wall=wall;
	}
	
	public Floor getFloor() {
		return this.floor;
	}
	
	public Roof getRoof() {
		return this.roof;
	}
	
	public Wall getWall() {
		return this.wall;
	}
}
