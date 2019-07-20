package threadTest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CyclicBarrier的测试程序，与CountdownLatch的区别在于可以重复计数，因为reset函数
 * @author Administrator
 *
 */
public class CyclicBarrierExample {
	public static void main(String[] args) throws InterruptedException {
		final int totalThread=10;
		CyclicBarrier cyclicBarrier=new CyclicBarrier(totalThread);
		ExecutorService service=Executors.newCachedThreadPool();
		for (int i = 0; i < totalThread; i++) {
			service.execute(()->{
				System.out.println("before");
				try {
					cyclicBarrier.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			Thread.sleep(1000);
		}
		System.out.println("after");
		service.shutdown();
	}
}
