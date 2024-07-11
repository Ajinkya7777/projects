package MulitiThreadingInstance;

public class GooglePay extends Thread {
	
	private HdfcBank hdfc;
	
	public GooglePay(HdfcBank hdfc) {
		this.hdfc=hdfc;
	}
	
	public void run() {
		this.hdfc.deposit(5000);
	}
}