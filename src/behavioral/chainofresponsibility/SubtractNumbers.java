package behavioral.chainofresponsibility;

public class SubtractNumbers implements Chain{
	
	private Chain nextInChain;

	@Override
	public void setNextInChain(Chain nextInChain) {
		this.nextInChain=nextInChain;
	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalcWanted().equals("subtract")){
			System.out.println(request.getNumber1()+"-"+request.getNumber2()+"="+(request.getNumber1()-request.getNumber2()));
		}else{
			nextInChain.calculate(request);
		}
	}

	@Override
	public void getNextInChain() {
		System.out.println(nextInChain.getClass().getSimpleName());
	}
}
