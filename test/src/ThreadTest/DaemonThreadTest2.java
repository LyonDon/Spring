package threadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 守护线程使用线程池的方式开启
 * 
 * @author Administrator
 *
 */
public class DaemonThreadTest2 {

	public static void main(String[] args) {
		Thread mainThread = new Thread(new Runnable() {

			@Override
			public void run() {
				ExecutorService service = Executors.newCachedThreadPool();
				Thread thread = new Thread(new ChildThread1());
				thread.setDaemon(true);
				service.execute(thread);
				service.shutdown();
				System.out.println("This is main thread");
			}
		});
		mainThread.start();
	}

}

class ChildThread1 implements Runnable {

	@Override
	public void run() {

		while (true) {
			System.out.println("This is a child thread");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}