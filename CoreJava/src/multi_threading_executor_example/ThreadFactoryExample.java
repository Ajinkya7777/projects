package multi_threading_executor_example;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryExample implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {

		return new Thread(r);
	}

}
