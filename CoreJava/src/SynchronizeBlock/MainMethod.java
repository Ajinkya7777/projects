package SynchronizeBlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainMethod {

	public static void main(String[] args) {
		
		SynchroniezdExample d=new SynchroniezdExample();
		MainMethod m = new MainMethod();
		Lock l = new ReentrantLock();
		l.lock();
		Thread t1 = new Thread(()->m.display(d));
		Thread t2 = new Thread(()->m.display(d));
		Thread t3 = new Thread(()->m.display(d));
		Thread t4 = new Thread(()->m.display(d));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
	synchronized public void display(SynchroniezdExample d) {
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
