package SingletonPattern;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double initialBalance;
	public Account(int accountNumber, String accountHolder, double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.initialBalance = initialBalance;
	}
	public synchronized void withdraw(double amount) {
		if (initialBalance >= amount) {
			initialBalance -= amount;
			System.out.println("Withdrawn " + amount + " from account " + accountNumber+"of "+accountHolder);
		} else {
			System.out.println("Insufficient balance for account " + accountNumber);
		}
	}
	public synchronized void deposit(double amount) {
		initialBalance += amount;
		System.out.println("Deposited " + amount + " to account " + accountNumber);
	}
	public synchronized double getBalance() {
		return initialBalance;
	}
} 
