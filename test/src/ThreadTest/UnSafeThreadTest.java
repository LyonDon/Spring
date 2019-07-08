package threadTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 不安全线程测试
 * @author Administrator
 *
 */
public class UnSafeThreadTest {
	public static class Count{
		public int cnt=0;
		public void add(){
			cnt++;
		}
		public int get(){
			return cnt;
		}
	}
	
	public static void main(String[] args) {
		//设置线程总数为1000
		final int totalThread=1000;
		//使用Executors设置线程池
		ExecutorService service=Executors.newCachedThreadPool();
		Count count=new Count();
		//使用CountdownLatch设置屏障，数量设置为线程个数
		CountDownLatch countDownLatch=new CountDownLatch(totalThread);
		for (int i = 0; i < totalThread; i++) {
			//线程池中的线程执行
			service.execute(()->{
				count.add();
				countDownLatch.countDown();
			});
		}
		//执行完后关闭所有线程
		service.shutdown();
		//输出最终结果
		System.out.println(count.get());
	}
}
