package behavioral.visitor;

import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor {

	DecimalFormat df = new DecimalFormat("#.##");
	
	public TaxHolidayVisitor() {
	}
	
	@Override
	public double visit(Liquor liquor) {
		System.out.println("This is liquor item");
		return Double.parseDouble(df.format(liquor.getPrice()*1.10));
	}

	@Override
	public double visit(Tobacco tobacco) {
		System.out.println("This is Tobacco item");
		return Double.parseDouble(df.format(tobacco.getPrice()*1.30));
	}

	@Override
	public double visit(Necessity necessity) {
		System.out.println("This is Necessity item");
		return Double.parseDouble(df.format(necessity.getPrice()*1));
	}

}
