package behavioral.strategydesignpattern;

public interface Fly {

	String fly();

}

class CanFly implements Fly{

	@Override
	public String fly() {
		return "I am Flying";
	}
}

class CantFly implements Fly{

	@Override
	public String fly() {
		return "Can't Fly";
	}
}

