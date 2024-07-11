package SynchronizeBlock;

public class LockExample  {
	public void display(SynchroniezdExample d) {
		
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
	}
	
	public void display1(SynchroniezdExample d) {
		System.out.println("hi");
		System.out.println("hi");
		
		synchronized(d) {
			System.out.println("hi");
			System.out.println("hi");
		}
}
}