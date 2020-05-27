package com.techelevator;

public class CheckingAccount extends BankAccount {
	
	private int withdrawOverdraftMax = -100;
	private int overdraftFee = 10;
	private int balance = super.getBalance();
	
	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}

	@Override
	public int withdraw(int amountToWithdraw) {
		if (balance - amountToWithdraw < 0) {
			amountToWithdraw += overdraftFee;
		}
		if (balance - amountToWithdraw < withdrawOverdraftMax) {
			balance -= 0;
		}
		else {
			return super.withdraw(amountToWithdraw);
		}
		return balance;
	}
}
