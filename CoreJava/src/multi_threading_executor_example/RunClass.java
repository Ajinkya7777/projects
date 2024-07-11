package multi_threading_executor_example;

import java.util.concurrent.Callable;

public class RunClass implements Callable<Object> {

	private Customer c;

	public RunClass(Customer c) {
		this.c = c;
	}

	/*
	 * @Override public void run() { triggerMail(c); }
	 */

	private void triggerMail(Customer c) {
		System.out.println("sending email....!");
		StringBuffer str = new StringBuffer();

		str.append("Hi " + c.getName());
		str.append(" please pay amount " + c.getAmount() + " for your policy no " + c.getPolicyNo());
		c.setMsg(str.toString());
	}

	@Override
	public Object call() throws Exception {

		return c.getMsg();
	}

}
