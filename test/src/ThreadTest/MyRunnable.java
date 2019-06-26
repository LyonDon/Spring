package threadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
/**
 * 使用Runnable实现创建一个线程
 * @author Administrator
 *
 */
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		
	}

	public static void main(String[] args) {
		MyRunnable runnable=new MyRunnable();
		Thread t=new Thread(runnable);
		t.start();
	}
}

/**
 * 使用Callable创建一个线程
 * @author Administrator
 *
 */
class MyCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		return null;
	}
	
	public static void main(String[] args) {
		MyCallable callable=new MyCallable();
		//使用FutureTask对Callable的返回值进行封装
		FutureTask<Integer> task=new FutureTask<Integer>(callable);
		Thread thread=new Thread(task);
		thread.start();
	}
}

/**
 * 使用继承Thread的方式创建一个线程
 * @author Administrator
 *
 */
class MyThread extends Thread{
	public void run() {
	}
	
	public static void main(String[] args) {
		MyThread thread=new MyThread();
		thread.start();
	}
}
