package com.sunh.bankaccount;
import java.util.Random;

public class BankAccount {
	protected String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	public static int numberofAccount = 0;
	public static int totalAmount = 0;
	private String createAccount;
	public BankAccount() {
		setAccount();
		setChecking();
		setSavings();
	    numberofAccount++;	    
	}
	private void setAccount() {
		// TODO Auto-generated method stub
		this.accountNumber = createAccount;
	}	
	private void setChecking() {
			// TODO Auto-generated method stub
		this.checkingBalance = 0;
	}
	private void setSavings() {
		// TODO Auto-generated method stub
		this.savingsBalance = 0;
	}
	public BankAccount AccountNumber() {
		return this;
	}
	public BankAccount numberofAccount() {
		return this;
	}
	public double withdrawChecking(int i) {
		if (i > this.checkingBalance) {
			return i;
		} else {
			this.checkingBalance -= i;
			totalAmount -= i; 
		}
		return this.checkingBalance;
	}
	public double withdrawSavings(int x) {
		if (x > this.savingsBalance) {
			return x;
		} else {
			this.savingsBalance -= x;
			totalAmount -= x;
	}
		return this.savingsBalance;
	}
	public void depositChecking(double deposit) {
		this.checkingBalance += deposit;
		totalAmount += deposit;
	}
	public void depositSavings(double deposit2) {
		this.savingsBalance += deposit2;
		totalAmount += deposit2;
	}
	public double totalAmount() {
		return this.checkingBalance + this.savingsBalance;
	}
	public void viewBalance() {
		System.out.println(" Checking balance: $" + this.checkingBalance + " Savings balance: $" + this.savingsBalance);
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
}