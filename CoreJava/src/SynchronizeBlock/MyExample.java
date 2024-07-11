package SynchronizeBlock;

public class MyExample {

	public static void main(String[] args) {
		
		MyExample m = new MyExample();
		new Thread(()->m.display1()).start();
	}
	
	synchronized public void display() {
		System.out.println("hi");
	}
	
	public void display1() {
		System.out.println("hi");
		synchronized (this) {
			System.out.println("This is Synchronized Block ");
		}
	}
}
