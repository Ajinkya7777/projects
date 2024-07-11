package ReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteExample {

	int amount = 0;
	int balance = 10000;
	ReentrantReadWriteLock rw = new ReentrantReadWriteLock();

	public static void main(String[] args) {
		ReadWriteExample rwe=new ReadWriteExample();

		Thread t1 = new Thread(() -> rwe.checkBalanceGpay());
		Thread t2 = new Thread(() -> rwe.checkBalanceUPI());
		Thread t3 = new Thread(() -> rwe.checkBalancePhoneApp());
		Thread t4 = new Thread(() -> rwe.withdraw(100));
		Thread t5 = new Thread(() -> rwe.deposit(1000));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

	public void checkBalanceUPI() {
		rw.readLock().lock();
		System.out.println("balance" + balance);
		rw.readLock().unlock();
	}

	public void checkBalancePhoneApp() {
		rw.readLock().lock();
		System.out.println("balance" + balance);
		rw.readLock().unlock();
	}

	public void checkBalanceGpay() {
		rw.readLock().lock();
		System.out.println("balance" + balance);
		rw.readLock().unlock();
	}

	public void withdraw(int amount) {
		rw.writeLock().lock();
		balance = balance - amount;
		rw.writeLock().unlock();
	}

	public void deposit(int amount) {
		rw.writeLock().lock();
		balance = balance + amount;
		rw.writeLock().unlock();
	}

}
