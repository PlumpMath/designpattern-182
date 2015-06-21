package structural.decorator;

public class Milk extends CoffeeDecorator{

	public Milk(Coffee coffee) {
		super(coffee);
	}
	
	public double getCost(){
		return super.getCost()+0.5;
	}

	public String getIngredients(){
		return super.getIngredients() + ingredientSeparator + "Milk";
	}
}
