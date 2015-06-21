package structural.facade;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;
	
	//All the subsystem class object will be created in Constructor
	//Keeping the reference of all the sub system classes as class variable 
	AccountNumberCheck acctChecker;
	SecurityCodeCheck secCodeChecker;
	FundCheck fundChecker;
	WelcomeToBank welcome;
	
	
	public BankAccountFacade(int accountNumber, int securityCode) {
		this.accountNumber=accountNumber;
		this.securityCode=securityCode;
		
		acctChecker=new AccountNumberCheck();
		secCodeChecker=new SecurityCodeCheck();
		fundChecker=new FundCheck();
		welcome=new WelcomeToBank();
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}

	public int getSecurityCode(){
		return securityCode;
	}
	
	public void withdrawCash(double cashToWithdraw) {
		if(acctChecker.accountActive(accountNumber) && secCodeChecker.accountActive(securityCode) && fundChecker.haveEnoughMoney(cashToWithdraw)){
			System.out.println("Transaction Complete.");
		}
		else{
			System.out.println("Transaction Failed.");
		}
	}

	public void depositCash(double cashToDeposit){
		if(acctChecker.accountActive(accountNumber) && secCodeChecker.accountActive(securityCode)){
			fundChecker.makeDeposit(cashToDeposit);
			System.out.println("Transaction Complete.");
		}
		else{
			System.out.println("Transaction Failed.");
		}
		
	}
	
	

}
