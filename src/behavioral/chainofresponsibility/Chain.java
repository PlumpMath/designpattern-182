package behavioral.chainofresponsibility;

public interface Chain {
	public void setNextInChain(Chain nextInChain);
	public void calculate(Numbers request);
	
	public void getNextInChain();
}
