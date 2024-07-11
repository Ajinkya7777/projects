package MulitiThreadingInstance;

public class MainClass {

	
	public static void main(String[] args) {
		
		HdfcBank ajinkyaAccount = new HdfcBank(7000);
		ATM atm = new ATM(ajinkyaAccount);
		GooglePay gpay = new GooglePay(ajinkyaAccount);
		PhonePay ppay = new PhonePay(ajinkyaAccount);
		NetBanking net = new NetBanking(ajinkyaAccount);
		
		atm.setName("ATM");
		gpay.setName("GooglePay");
		ppay.setName("PhonePay");
		net.setName("NetBanking");
		
		atm.start();
		gpay.start();
		ppay.start();
		net.start();
	}
	

	
}
