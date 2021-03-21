package com.sunh.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount sun = new BankAccount();
		BankAccount p = new BankAccount();
//		System.out.println(BankAccount.totalAmount);
		
		sun.depositChecking(2000);
		sun.depositSavings(3000);
		sun.totalAmount();
		sun.viewBalance();
		System.out.println(BankAccount.totalAmount);
		
		sun.withdrawChecking(3000);
		sun.withdrawSavings(2900);
		sun.totalAmount();
		sun.viewBalance();
		System.out.println(BankAccount.totalAmount);
		
		
		p.depositChecking(12000);
		p.depositSavings(30000);
		p.totalAmount();
		p.viewBalance();
		System.out.println(BankAccount.totalAmount);
		
		p.withdrawChecking(2000);
		p.withdrawSavings(500);
		p.totalAmount();
		p.viewBalance();
		System.out.println(BankAccount.totalAmount);
	}
}
