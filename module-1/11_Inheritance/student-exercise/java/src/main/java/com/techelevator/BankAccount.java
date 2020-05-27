package com.techelevator;
import java.math.BigDecimal;
public class BankAccount {
	private String accountHolderName;
	private String accountNumber;
	protected int balance;
	
	public BankAccount(String accountHolderName, String accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
	}
	public BankAccount(String accountHolderName, String accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public int deposit(int amountToDeposit) {
		BigDecimal bigBalance = new BigDecimal(balance);
		BigDecimal bigDepositAmount = new BigDecimal(amountToDeposit);
		bigBalance = bigBalance.add(bigDepositAmount);
		balance = bigBalance.intValue();
		return balance;
	}
	public int withdraw(int amountToWithdraw) {
		BigDecimal bigBalance = new BigDecimal(balance);
		BigDecimal bigWithdrawalAmount = new BigDecimal(amountToWithdraw);
		bigBalance = bigBalance.subtract(bigWithdrawalAmount);
		balance = bigBalance.intValue(); 
		return balance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	
}
