package MulitiThreadingInstance;

public class PhonePay extends Thread {

	private HdfcBank hdfc;
	public PhonePay(HdfcBank hdfc) {
		this.hdfc=hdfc;
	}
	
	public void run() {
		this.hdfc.checkBalance();
	}
}
