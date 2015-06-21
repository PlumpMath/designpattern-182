package structural.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Coffee c=new SimpleCoffee();
		
		c=new Milk(c);
		
		c=new Sprinkles(c);
		System.out.println("Cost: "+ c.getCost() + " Ingredients :" + c.getIngredients());
		c=new Whip(c);
		System.out.println("Cost: "+ c.getCost() + " Ingredients :" + c.getIngredients());
		c=new Sprinkles(c);
		System.out.println("Cost: "+ c.getCost() + " Ingredients :" + c.getIngredients());
		
		Coffee c2=new Sprinkles(new SimpleCoffee());
		System.out.println("Cost: "+ c2.getCost() + " Ingredients :" + c2.getIngredients());
		
		
		//Coffee c3=new Sprinkles();
		
	}

}
