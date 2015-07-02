package behavioral.visitor;

public class VisitorTest {

	public static void main(String args[]){
		
		TaxVisitor taxCalc = new TaxVisitor();
		
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
		
		Necessity milk = new Necessity(23);
		Liquor jackDaniels = new Liquor(200);
		
		System.out.println("At Regular days");
		System.out.println(milk.accept(taxCalc));
		System.out.println(jackDaniels.accept(taxCalc));
		
		System.out.println("At Holidays");
		System.out.println(milk.accept(taxHolidayCalc));
		System.out.println(jackDaniels.accept(taxHolidayCalc));
		
	}
}
