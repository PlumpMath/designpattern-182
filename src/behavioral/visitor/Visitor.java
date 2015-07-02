package behavioral.visitor;

public interface Visitor {

	//Using method overloading over here
	//Avoids use of instance of methods
	public double visit(Liquor liquor);
	public double visit(Tobacco tobacco);
	public double visit(Necessity necessity);
}
