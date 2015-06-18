package creational.prototype;

public class Dog implements Animal{
	
	public Dog(){
		System.out.println("Dog is made");
	}

	@Override
	public Animal makeCopy() {
		System.out.println("Dog is being made");
		Dog dogObject=null;
		try {
			dogObject=(Dog) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return dogObject;
	}
	
	public String toString(){
		return "Dog Object";
	}
}