package behavioral.template;

public class SandwichSculptor {

	public static void main(String[] args) {
		
		Hoagie cust23 = new ItalianHoagie();
		cust23.makeSandwich();
		
		Hoagie cust34Veggie = new VeggieHoagie();
		cust34Veggie.makeSandwich();

	}

}
