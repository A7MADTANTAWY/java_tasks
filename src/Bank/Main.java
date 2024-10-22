package Bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bank bank = new Bank();

	        // Creating accounts
	        Account account1 = new Account("12345", "Ahmed", 1000);
	        Account account2 = new Account("67890", "khaled", 500);

	        // Adding accounts to the bank
	        bank.addAccount(account1);
	        bank.addAccount(account2);

	        // Deposit and withdraw operations
	        bank.deposit("12345", 200);
	        bank.withdraw("67890", 100);

	        // Removing an account
	        bank.removeAccount("12345");

	        // Trying to find a removed account
	        bank.withdraw("12345", 50); // Should show "Account not found."
	}

}
