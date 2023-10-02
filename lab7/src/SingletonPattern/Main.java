package SingletonPattern;

public class Main {
	public static void main(String[] args) {
		AccountManager accountManager = AccountManager.getInstance();
		// Create accounts
		accountManager.createAccount(1, "ABCD EFG", 1000.0);
		accountManager.createAccount(2, "EFGH XYZ", 2000.0);
		// Perform operations
		accountManager.withdraw(1, 500.0);
		accountManager.deposit(2, 1000.0);
		// Get balances
		System.out.println("Balance of account 1: " + accountManager.getBalance(1));
		System.out.println("Balance of account 2: " + accountManager.getBalance(2)); 
	}
}
