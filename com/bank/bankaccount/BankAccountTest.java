package com.bank.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.deposit("checking", 1000);
		b1.deposit("saving", 200);
		b1.withdraw("checking", 100);
		b1.withdraw("saving", 100);
		System.out.println(b1.getCheckingBalance());
		System.out.println(b1.getSavingBalance());
		BankAccount.displayTotal();
		System.out.println(b1.getAccountNumber());
		
	}
}
