package behavioral.template;

public abstract class Hoagie {
	
	//Template method
	final void makeSandwich(){
		
		cutBun();
		
		if(customerWantsMeat()){
			addMeat();
		}
		
		if(customerWantsCheese()){
			addCheese();
		}
		
		if(customerWantsVeggie()){
			addVeggie();
		}
		
		if(customerWantsCondiments()){
			addCondiments();
		}
		
		wrapBun();
		
	}
	
	void cutBun(){
		System.out.println("Cut the bun");
	}
	
	//we need to define it as per our requirement
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVeggie();
	abstract void addCondiments();
	
	//Hooks -- we can override them as per our requirement of subclass
	boolean customerWantsMeat(){
		return true;
	}
	
	boolean customerWantsCheese(){
		return true;
	}
	
	boolean customerWantsVeggie(){
		return true;
	}
	
	boolean customerWantsCondiments(){
		return true;
	}

	void wrapBun(){
		System.out.println("Wrap the bun");
	}
}
