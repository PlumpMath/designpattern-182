package behavioral.mediator;

import java.util.ArrayList;

public class StockMediator implements Mediator{

	private ArrayList<Colleague> colleagues;
	private ArrayList<StockOffer> stockBuyOffers;
	private ArrayList<StockOffer> stockSellOffers;
	
	private int colleagueCode=0;
	public StockMediator() {
		colleagues=new ArrayList<Colleague>();
		stockBuyOffers = new ArrayList<StockOffer>();
		stockSellOffers = new ArrayList<StockOffer>();
	}
	
	@Override
	public void addColleague(Colleague colleague) {
		colleagues.add(colleague);
		colleagueCode++;
		colleague.setCollCode(colleagueCode);
		System.out.println("Added colleague with code " + colleagueCode );
	}
	
	@Override
	public void saleOffer(String stock, int shares, int colleagueCode) {
		boolean stockSold=false;
		for(StockOffer offer:stockBuyOffers){
			if(offer.getStockSymbol().equals(stock) && offer.getStockShares()==shares){
				System.out.println(stock+ " shares of " + shares + " sold to " + offer.getColleagueCode());
				stockBuyOffers.remove(offer);
				stockSold=true;
				break;
			}
		}
		
		if(!stockSold){
			System.out.println(stock + " shares of " + shares + " added to stock sell offers");
			StockOffer offer = new StockOffer(shares, stock, colleagueCode);
			stockSellOffers.add(offer);
		}
	}

	@Override
	public void buyOffer(String stock, int shares, int colleagueCode) {
		boolean stockBought=false;
		for(StockOffer offer:stockSellOffers){
			if(offer.getStockSymbol().equals(stock) && offer.getStockShares()==shares){
				System.out.println(stock+ " shares of " + shares + " bought by " + offer.getColleagueCode());
				stockSellOffers.remove(offer);
				stockBought=true;
				break;
			}
		}
		if(!stockBought){
			System.out.println(stock + " shares of " + shares + " added to stock buy offers");
			StockOffer offer = new StockOffer(shares, stock, colleagueCode);
			stockBuyOffers.add(offer);
		}
	}
	
	public void getStockOfferings(){
		
		System.out.println("Stock offer for sale");
		for (StockOffer offer : stockSellOffers) {
			System.out.print("Stock "+offer.getStockSymbol());
			System.out.print(" -- Share"+offer.getStockShares());
		}
		
		System.out.println("Stock offer for Buying");
		for (StockOffer offer : stockBuyOffers) {
			System.out.print("Stock "+offer.getStockSymbol());
			System.out.print(" -- Share"+offer.getStockShares());
		}
	}
}
