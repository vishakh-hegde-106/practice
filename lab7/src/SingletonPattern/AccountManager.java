package SingletonPattern;

import java.util.HashMap;
import java.util.Map; 

public class AccountManager {
	private static final AccountManager INSTANCE = new AccountManager();
	private Map<Integer, Account> accounts;
	private AccountManager() {
		accounts = new HashMap<>();
	}
	public static AccountManager getInstance() {
		return INSTANCE;
	}
	public synchronized void createAccount(int accountNumber, String accountHolder, double initialBalance) {
		Account account = new Account(accountNumber, accountHolder, initialBalance);
		accounts.put(accountNumber, account);
	}
	public synchronized void withdraw(int accountNumber, double amount) {
		Account account = accounts.get(accountNumber);
		if (account != null) {
			account.withdraw(amount);
		} else {
			System.out.println("Account not found: " + accountNumber);
		}
	}
	public synchronized void deposit(int accountNumber, double amount) {
		Account account = accounts.get(accountNumber);
		if (account != null) {
			account.deposit(amount);
		} else {
			System.out.println("Account not found: " + accountNumber);
		}
	}
	public synchronized double getBalance(int accountNumber) {
		Account account = accounts.get(accountNumber);
		if (account != null) {
			return account.getBalance();
		} else {
			System.out.println("Account not found: " + accountNumber);
			return -1.0; // Return a negative value to indicate account not found
		}
	}
} 
