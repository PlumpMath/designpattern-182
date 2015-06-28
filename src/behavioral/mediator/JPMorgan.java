package behavioral.mediator;

public class JPMorgan extends Colleague{

	public JPMorgan(Mediator mediator) {
		super(mediator);
		System.out.println("JP Morgan signed up for exchange");
	}
}
