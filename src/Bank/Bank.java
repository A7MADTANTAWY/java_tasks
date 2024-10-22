package Bank;
import java.util.ArrayList;

public class Bank {
	 private ArrayList<Account> accounts;

	    // Constructor to initialize the bank
	    public Bank() {
	        this.accounts = new ArrayList<>();
	    }

	    // Method to add a new account to the bank
	    public void addAccount(Account account) {
	        accounts.add(account);
	        System.out.println("Account added: " + account.getAccountNumber());
	    }

	    // Method to remove an account by account number
	    public void removeAccount(String accountNumber) {
	        Account accountToRemove = findAccount(accountNumber);
	        if (accountToRemove != null) {
	            accounts.remove(accountToRemove);
	            System.out.println("Account removed: " + accountToRemove.getAccountNumber());
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    // Method to find an account by account number
	    public Account findAccount(String accountNumber) {
	        for (Account account : accounts) {
	            if (account.getAccountNumber().equals(accountNumber)) {
	                return account;
	            }
	        }
	        return null;
	    }

	    // Method to deposit money into an account
	    public void deposit(String accountNumber, double amount) {
	        Account account = findAccount(accountNumber);
	        if (account != null) {
	            account.deposit(amount);
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    // Method to withdraw money from an account
	    public void withdraw(String accountNumber, double amount) {
	        Account account = findAccount(accountNumber);
	        if (account != null) {
	            account.withdraw(amount);
	        } else {
	            System.out.println("Account not found.");
	        }
	    }
}
