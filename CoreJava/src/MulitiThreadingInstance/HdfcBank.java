package MulitiThreadingInstance;

public class HdfcBank {

	int balance;

	public HdfcBank(int balance) {
		this.balance = balance;
	}

	synchronized public void deposit(int amountToBeDeposited) {
		balance = this.balance + amountToBeDeposited;
		System.out.println("Balnce after Deposit:" + balance);
	}

	synchronized public void withdraw(int amountToBeWithdraw) {
		balance = this.balance - amountToBeWithdraw;
		System.out.println("Balance after Withdraw:" + balance);
	}

	synchronized public void checkBalance() {
		System.out.println("Your Balance is:" + balance);
	}

	public void updateProfile() {

		System.out.println("Profile is updated...!");
	}
}
