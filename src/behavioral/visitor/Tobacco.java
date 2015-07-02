package behavioral.visitor;

public class Tobacco implements Visitable{

	private double price;
	
	public Tobacco(double price) {
		this.price=price;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public double accept(Visitor visitor) {
		//We are passing visitor object
		//which has Polymorphic method for it
		//this is passed as reference to the object -- for calculation
		return visitor.visit(this);
	}
}
