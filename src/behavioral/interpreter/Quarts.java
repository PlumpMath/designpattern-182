package behavioral.interpreter;

public class Quarts extends Expression{

	@Override
	public String gallons(Double quantity) {
		return Double.toString(quantity/4);
	}

	@Override
	public String quarts(Double quantity) {
		return Double.toString(quantity);
	}

	@Override
	public String pints(Double quantity) {
		return Double.toString(quantity*2);
	}

	@Override
	public String cups(Double quantity) {
		return Double.toString(quantity*4);
	}

	@Override
	public String tablespoons(Double quantity) {
		return Double.toString(quantity*64);
	}
	

}
