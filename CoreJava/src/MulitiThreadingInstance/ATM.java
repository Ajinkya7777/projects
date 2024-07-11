package MulitiThreadingInstance;

public class ATM extends Thread {

	private HdfcBank hdfc;
	public ATM(HdfcBank hdfc) {
		 this.hdfc=hdfc;
	}
	
	public void run() {
		this.hdfc.withdraw(3000);
	}
}
