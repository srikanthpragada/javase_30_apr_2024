package oop1;

class Account  {
	private int acno;
	private String ahname;
	private double balance;
	
	private static int minBalance = 5000;
	
	public Account(int acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}
	
	public Account(int acno, String ahname, double balance) {
		this(acno, ahname); // call another constructor 
		this.balance = balance;
	}
	
	public void depsoit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if (this.balance - Account.minBalance >= amount)
		    this.balance -= amount;
	}
	
	public double getBalance() {
		return this.balance; 
	}
	
	public static int getMinBalance() {
		return Account.minBalance;
	}
}

public class TestAccount {

	public static void main(String[] args) {
		 Account a = new Account(1, "Scott", 30000);
		 a.depsoit(20000);
		 a.withdraw(10000);
		 
		 System.out.println(a.getBalance());

	}

}
