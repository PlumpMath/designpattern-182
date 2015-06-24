package behavioral.chainofresponsibility;

public class DivideNumbers implements Chain{
	
	private Chain nextInChain;

	@Override
	public void setNextInChain(Chain nextInChain) {
		this.nextInChain=nextInChain;
	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalcWanted().equals("divide")){
			System.out.println(request.getNumber1()+"/"+request.getNumber2()+"="+(request.getNumber1()/request.getNumber2()));
		}else{
			//Since this will be last in chain -- so will be printing out unsupported
			System.out.println("Operation allowed are add,subtract,multiply,divide");
		}
	}

	@Override
	public void getNextInChain() {
		System.out.println(nextInChain.getClass().getSimpleName());
	}
}
