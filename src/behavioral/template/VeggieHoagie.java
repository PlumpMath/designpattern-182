package behavioral.template;

public class VeggieHoagie extends Hoagie{

	//Overriding hooks
	@Override
	boolean customerWantsMeat(){
		return false;
	}
	
	@Override
	boolean customerWantsCheese(){
		return false;
	}
	
	//we need to over ride and do nothing over here
	@Override
	void addMeat() {}

	@Override
	void addCheese() {}

	@Override
	void addVeggie() {
		System.out.println("Added Veggie for Veggie Hoagie");
	}

	@Override
	void addCondiments() {
		System.out.println("Added condiments for Veggie Hoagie");
	}
}
