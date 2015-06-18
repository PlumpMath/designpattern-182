package creational.prototype;

public class Sheep implements Animal{
	
	private int noOfLegs=4;
	
	public Sheep(){
		System.out.println("Sheep is made");
	}

	@Override
	public Animal makeCopy() {
		System.out.println("Sheep is being made");
		
		Sheep sheepObject=null;
		try {
			sheepObject=(Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sheepObject;
	}
	
	public String toString(){
		return "Sheep Object";
	}
	
	public void setNoOfLegs(int noOfLegs){
		this.noOfLegs=noOfLegs;
	}
	
	public int getNoOfLegs(){
		return this.noOfLegs;
	}
}