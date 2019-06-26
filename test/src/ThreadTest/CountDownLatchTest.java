package threadTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch的测试程序，控制线程等待多个线程
 * @author Administrator
 *
 */
public class CountDownLatchTest {
	public static void main(String[] args) throws InterruptedException {
		final int totalThread = 10;

		CountDownLatch countDownLatch = new CountDownLatch(totalThread);
		ExecutorService service = Executors.newCachedThreadPool();
		for (int i = 0; i < totalThread; i++) {
			service.execute(() -> {

					System.out.println("run");
					
					countDownLatch.countDown();
				});
			Thread.sleep(1000);
		}
		countDownLatch.await();
		System.out.println("end");
		service.shutdown();
	}
}
