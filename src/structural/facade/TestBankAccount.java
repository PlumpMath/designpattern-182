package structural.facade;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccountFacade accessingBank= new BankAccountFacade(12345678,123);
		accessingBank.withdrawCash(50.00);
		accessingBank.withdrawCash(900.00);
		accessingBank.depositCash(50.00);
	}

}
