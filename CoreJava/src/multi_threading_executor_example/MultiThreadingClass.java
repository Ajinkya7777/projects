package multi_threading_executor_example;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadingClass {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		ArrayList<Future<Object>> al = new ArrayList<>();
		
		ThreadFactoryExample threadFactory = new ThreadFactoryExample();

		customerList.add(new Customer("Ajinkya", "PL123", 1000));
		customerList.add(new Customer("Swati", "PL124", 2000));
		customerList.add(new Customer("Shubham", "PL125", 3000));
		customerList.add(new Customer("Karthik", "PL126", 4000));
		customerList.add(new Customer("Sagar", "PL127", 5000));
		customerList.add(new Customer("Gaurav", "PL128", 6000));
		customerList.add(new Customer("Amit", "PL129", 7000));
		customerList.add(new Customer("Shekhar", "PL120", 9000));

//		ExecutorService ex = Executors.newSingleThreadExecutor();
//		ExecutorService ex = Executors.newSingleThreadExecutor();
		ExecutorService ex = Executors.newFixedThreadPool(3, threadFactory);
				

		for (Customer c : customerList) {
			// ex.execute(new RunClass(c));
			Future<Object> future = ex.submit(new RunClass(c));
			al.add(future);
		}

		for (Future<Object> f : al) {
			System.out.println(f.toString());

		}

		ex.isShutdown();
	}
}
