package behavioral.mediator;

public abstract class Colleague {
	
	private Mediator mediator;
	private int colleagueCode;
	//All Colleague will have an colleague code
	//All colleague will be using same mediator
	public Colleague(Mediator mediator){
		this.mediator=mediator;
		
		//IMP we need to call - mediator add
		//this.mediator is for adding the colleague
		//(this) is used for object for adding the object created to mediator
		this.mediator.addColleague(this);
	}
	
	public void saleOffer(String stock,int shares){
		//Sale offer will call mediator with colleague code for doing so
		//All colleague object will contact mediator to do the work
		mediator.saleOffer(stock,shares,this.colleagueCode);
	}

	public void buyOffer(String stock,int shares){
		//Buy offer will call mediator with colleague code for doing so
		mediator.buyOffer(stock,shares,this.colleagueCode);
	}
	
	public void setColleagueCode(int colleagueCode){
		this.colleagueCode=colleagueCode;
	}
}
