package threadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InterruptTest {
	/**
	 * 测试interrupt（）的例子
	 * @author Administrator
	 *
	 */
	private static class MyThread extends Thread{
		public void run() {
			try {
				Thread.sleep(1000);
				System.out.println("Thread Start");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 引入isinterrupt（），用于测试是否存在中断，若是存在的话直接终止线程
	 * @author Administrator
	 *
	 */
	private static class MyThread2 extends Thread{
		public void run() {
			while(!interrupted()){
				try {
					Thread.sleep(1000);
					System.out.println("thread start");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("thread end");
		}
	}
	
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start();
//		myThread.interrupt();
//		System.out.println("main run");
		
		//调用Executor的shutdown方法，相当于调用所有线程的interrupt方法
		ExecutorService executorService=Executors.newCachedThreadPool();
		executorService.execute(myThread);
		executorService.shutdownNow();
		System.out.println("main run");
		
	}
}
