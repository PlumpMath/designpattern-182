package behavioral.template;

public class ItalianHoagie extends Hoagie{

	@Override
	void addMeat() {
		System.out.println("Added meat for Italian Hoagie");
	}

	@Override
	void addCheese() {
		System.out.println("Added cheese for Italian Hoagie");
		
	}

	@Override
	void addVeggie() {
		System.out.println("Added Vegetable for Italian Hoagie");
	}

	@Override
	void addCondiments() {
		System.out.println("Added condiments for Italian Hoagie");
	}
	
}
