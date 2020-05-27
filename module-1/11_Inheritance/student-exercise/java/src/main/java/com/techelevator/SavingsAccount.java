package com.techelevator;

public class SavingsAccount extends BankAccount {
	
	private int fee = 2;
	private int balance = super.getBalance();
	
	
	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}
	
	@Override
	public int withdraw(int amountToWithdraw) {
		if (amountToWithdraw > balance) {
			return balance;
		}
		else { 
			if (balance - amountToWithdraw < 150) { 
			amountToWithdraw += fee;
			}
		}	
		return super.withdraw(amountToWithdraw);	
	}	
}
