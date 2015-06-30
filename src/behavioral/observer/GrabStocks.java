package behavioral.observer;

public class GrabStocks {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(161.45);
		stockGrabber.setAAPLPrice(1000.00);
		stockGrabber.setGOOGPrice(234.00);
		
		stockGrabber.unregister(observer1);
		//Since observer 1 is ntot present we wont get any update for it
		//Anytime set is called - update method of observer are called
		stockGrabber.setIBMPrice(1567.00);
		
		//Using Threading for Updating the price
		//which will update all the observer in it
		//who has been added to it
		
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 1234.93);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 4234.93);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 2234.93);
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
		

	}

}
