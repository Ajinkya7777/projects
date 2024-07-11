package MulitiThreadingInstance;

public class NetBanking extends Thread {

	private HdfcBank hdfc;
	public NetBanking(HdfcBank hdfc) {
		this.hdfc=hdfc;
	}
	
	public void run() {
		this.hdfc.updateProfile();
	}
}
