package behavioral.mediator;

public class TestStockMediator {

	public static void main(String[] args) {
		StockMediator nyse = new StockMediator();
		
		//Broker is registered to nyse
		GoldmanSachs broker = new GoldmanSachs(nyse);
		JPMorgan broker2 = new JPMorgan(nyse);
		
		//over here we are having similar behaviour of broker 
		//since both are identical
		//but normally they will be different and they will be buying different stuff
		//as per their calculation
		
		broker.saleOffer("AAPL", 100);
		broker.saleOffer("GOOG", 120);
		
		broker2.buyOffer("GOOG", 120);
		broker2.saleOffer("IBM", 100);
		
		broker.buyOffer("IBM", 100);
		
		nyse.getStockOfferings();
		

	}

}
