package base;

import base.Account;

public class InsufficientFundsException extends Exception {
	
	private Account A;
	
	public InsufficientFundsException(Account A){
		super();
		this.A=A;
	}
	public Account getA(){
		return A;
	}
}
