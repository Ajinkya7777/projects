package multi_threading_executor_example;

public class Customer {

	private String name;
	private String msg;
	private String policyNo;
	private int amount;
	public Customer(String name, String policyNo, int amount) {
		
		this.name = name;
		this.policyNo = policyNo;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
