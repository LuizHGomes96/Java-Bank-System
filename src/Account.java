
public class Account {

	private double balance = 0;
	private double depositing;
	private double withdrawing;
	
	Account(double balance, double depositing, double withdrawing){
		this.setBalance(balance);
		this.setDepositing(depositing);
		this.setWithdrawing(withdrawing);
	}
	
	
	// GETTERS
	public double getBalance() {
		return balance;
	}
	
	public double getDepositing() {
		return depositing;
	}
	
	public double getWithdrawing() {
		return withdrawing;
	}
	
	// SETTERS
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setDepositing(double depositing) {
		this.depositing = depositing;
	}
	
	public void setWithdrawing(double withdrawing) {
		this.withdrawing = withdrawing;
	}
	
	// OPTIONS	
	void deposit(double depositing) {
		balance += depositing;
		System.out.printf("You deposited $%.2f", depositing);
		System.out.println();
		System.out.printf("Your new account balance is $%.2f", balance);
		System.out.println();
	}
	
	void withdraw(double withdrawing) {
		if (withdrawing > balance) {
			System.out.printf("The value you're trying to withdraw is higher than the value you have available, which is $%.2f.", balance);
		}
		else {
			balance -= withdrawing;
			System.out.printf("You withdrew $%.2f", withdrawing);
			System.out.println();
			System.out.printf("Your new account balance is $%.2f", balance);
			System.out.println();
		}
	}
	
	void check() {
		System.out.printf("Your current account balance is $%.2f.", balance);
		System.out.println();
	}
	
	
	// MENU
	void menu() {
		System.out.println("############### MENU ###############");
		System.out.println("1 - Check your account balance");
		System.out.println("2 - Deposit");
		System.out.println("3 - Withdraw");
		System.out.println("4 - Exit");
		System.out.println("Choose an option");
		
		
			}
	
}
