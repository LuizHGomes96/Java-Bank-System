import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Account account = new Account();
		Scanner scanner = new Scanner(System.in);
		boolean logged = true;

		while (logged==true) {
			account.menu();

			int action = scanner.nextInt();

			switch (action) {
			case (1):
				account.check();
				break;
			case (2):
				System.out.println("How much do you want to deposit?");
				account.depositing = scanner.nextDouble();
				account.deposit(account.depositing);
				break;
			case (3):
				System.out.println("How much do you want to withdraw?");
				account.withdrawing = scanner.nextDouble();
				account.withdraw(account.withdrawing);
				break;
			case (4):
				System.out.println("Goodbye!");
				logged = false;
				break;
			default:
				System.out.println("Invalid option.");
				break;
			}
			continue;
		}
		
		scanner.close();
	}

}
