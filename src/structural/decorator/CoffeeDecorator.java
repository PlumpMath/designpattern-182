package structural.decorator;

public abstract class CoffeeDecorator implements Coffee{
	
	protected final Coffee coffee;
	protected String ingredientSeparator=",";
	
	public CoffeeDecorator(Coffee coffee){
		this.coffee=coffee;
	}
	
	public double getCost(){
		return coffee.getCost();
	}
	
	public String getIngredients(){
		return coffee.getIngredients();
	}
}
