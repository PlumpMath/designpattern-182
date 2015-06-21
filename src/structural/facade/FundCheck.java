package structural.facade;

public class FundCheck {

	private double cashInAccount=1000.00;
	
	public double getCashInAccount(){
		return cashInAccount;
	}
	
	public void decreaseCashInAccount(double cashWithdrawn){
		cashInAccount-=cashWithdrawn;
	}
	
	public void increaseCashInAccount(double deposit){
		cashInAccount+=deposit;
	}
	
	public boolean haveEnoughMoney(double cashToWithdraw){
		if(cashToWithdraw>getCashInAccount()){
			System.out.println("Error: You don't have enouhg money!!");
			System.out.println("Current Balance:"+getCashInAccount());
			return false;
		}else{
			decreaseCashInAccount(cashToWithdraw);
			System.out.println("Withdrawl Complete : Current Balance in Account:"+getCashInAccount());
			return true;
		}
	}
	
	public void makeDeposit(double cashToDeposit){
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposit Complete : Current Balance in Account:"+getCashInAccount());
	}
}
