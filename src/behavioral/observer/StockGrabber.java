package behavioral.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject{
	
	//Array list for holding the Observer
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer observer) {
		observers.add(observer);
		System.out.println("Observer added");
	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);
		System.out.println("Observer deleted");
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	}

	public void setIBMPrice(double ibmPrice){
		this.ibmPrice=ibmPrice;
		//After price has been changed we are notifying the observer
		this.notifyObserver();
	}
	
	public void setAAPLPrice(double aaplPrice){
		this.aaplPrice=aaplPrice;
		//After price has been changed we are notifying the observer
		this.notifyObserver();
	}
	
	public void setGOOGPrice(double googPrice){
		this.googPrice=googPrice;
		//After price has been changed we are notifying the observer
		this.notifyObserver();
	}
}
