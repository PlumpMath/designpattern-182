package behavioral.observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

	private int startTime;
	private String stock;
	private double price;
	
	private Subject stockGrabber;
	
	public GetTheStock(Subject stockGrabber,int startTime,String stock,double price){
		this.stockGrabber = stockGrabber;
		this.startTime = startTime;
		this.stock = stock;
		this.price = price;
	}
	
	@Override
	public void run() {
		for(int i=0;i<=20;i++){
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){}
			
			//Fluctuation in stock -.3 to +.3
			Double randNum = (Math.random()* 0.06) - 0.03;
			
			DecimalFormat df = new DecimalFormat("#.##");
			this.price = Double.valueOf(df.format(this.price + randNum));
			
			if(stock =="IBM") ((StockGrabber) stockGrabber).setIBMPrice(price);
			if(stock =="AAPL") ((StockGrabber) stockGrabber).setAAPLPrice(price);
			if(stock =="GOOG") ((StockGrabber) stockGrabber).setGOOGPrice(price);
			
			System.out.println("Stock " + stock + " : " + this.price + " " +df.format(randNum));
		}
	}

}
