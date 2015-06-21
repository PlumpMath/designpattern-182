package structural.decorator;

public class Whip extends CoffeeDecorator{

	public Whip(Coffee coffee) {
		super(coffee);
	}
	
	public double getCost(){
		return super.getCost()+0.7;
	}

	public String getIngredients(){
		return super.getIngredients() + ingredientSeparator + "Whip";
	}
}
