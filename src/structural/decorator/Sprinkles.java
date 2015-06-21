package structural.decorator;

public class Sprinkles extends CoffeeDecorator{

	public Sprinkles(Coffee coffee) {
		super(coffee);
	}
	
	public double getCost(){
		return super.getCost()+0.2;
	}

	public String getIngredients(){
		return super.getIngredients() + ingredientSeparator + "Sprinkles";
	}
}
