package behavioral.observer;

public class StockObserver implements Observer {

	//as per our requirement we can have 
	//concrete observer which monitors one ,two or all three stock price
	
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	//to get each observer id we will be using
	private static int observerIDTracker = 0;
	
	//Each observer an ID - which will not be static
	private int observerID;
	
	//To make reference to stockGrabber
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber ) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer " + this.observerID);
		
		//this is the reason we needed StockGrabber object
		//So that we can reference the Subject
		//this refers the whole object
		stockGrabber.register(this);
		
	}
	
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printPrices();
	}

	public void printPrices(){
		System.out.println("Observer ID : " + observerID);
		System.out.println("AAPL "+this.aaplPrice);
		System.out.println("GOOG "+this.googPrice);
		System.out.println("IBM "+this.ibmPrice);
	}
}
