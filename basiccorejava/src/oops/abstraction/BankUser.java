package oops.abstraction;

public class BankUser {

	public static void main(String[] args)
	{
		RBI acc;
		acc=new CITI();
		acc.creditCard();
		acc.currentAccount();
		acc.debitCard();
		acc.savingAccount();
		
		
		acc=new PNB();
		acc.creditCard();
		acc.currentAccount();
		acc.debitCard();
		acc.savingAccount();
		
		acc=new BOI();
		acc.creditCard();
		acc.currentAccount();
		acc.debitCard();
		acc.savingAccount();
		

	}

}
