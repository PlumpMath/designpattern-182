package behavioral.chainofresponsibility;

public class TestCalculationChain {

	public static void main(String[] args) {
		Chain chainCal1=new AddNumbers();
		Chain chainCal2=new SubtractNumbers();
		Chain chainCal3=new MultiplyNumbers();
		Chain chainCal4=new DivideNumbers();
		
		//Setting up the chain over here
		chainCal1.setNextInChain(chainCal2);
		chainCal2.setNextInChain(chainCal3);
		chainCal3.setNextInChain(chainCal4);
		
		//chainCal1.getNextInChain();
		//chainCal2.getNextInChain();
		Numbers request=new Numbers(4, 6, "subtract");
		
		chainCal1.calculate(request);
	}

}
