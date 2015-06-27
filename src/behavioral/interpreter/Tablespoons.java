package behavioral.interpreter;

public class Tablespoons extends Expression{

	@Override
	public String gallons(Double quantity) {
		return Double.toString(quantity/256);
	}

	@Override
	public String quarts(Double quantity) {
		return Double.toString(quantity/64);
	}

	@Override
	public String pints(Double quantity) {
		return Double.toString(quantity/32);
	}

	@Override
	public String cups(Double quantity) {
		return Double.toString(quantity/16);
	}

	@Override
	public String tablespoons(Double quantity) {
		return Double.toString(quantity);
	}
}
