package threadTest;

import java.util.logging.Logger;

/**
 * 两个线程交替打印奇数偶数
 * @author Administrator
 *
 */
public class TwoThreadWaitNotify {
	//设置
	private int num=1;
	private boolean flag=false;
	
	public static void main(String[] args) {
		TwoThreadWaitNotify number=new TwoThreadWaitNotify();
		
		Thread thread1=new Thread(new Own(number));
		thread1.setName("AThread");
		Thread thread2=new Thread(new Odd(number));
		thread2.setName("BThread");
		
		thread1.start();
		thread2.start();
	}
	
	/**
	 * 偶数线程
	 * @author Administrator
	 *
	 */
	public static class Own implements Runnable{
		private TwoThreadWaitNotify numNotify;
		
		public Own(TwoThreadWaitNotify numNotify) {
			this.numNotify=numNotify;
		}
		
		@Override
		public void run() {
			Logger.getLogger("runA");
			while(numNotify.num<=100){
				synchronized (TwoThreadWaitNotify.class) {
					if (numNotify.flag==true) {
						System.out.println(Thread.currentThread().getName()+"偶数"+numNotify.num);
						numNotify.num++;
						numNotify.flag=false;
//						try {
//							Thread.sleep(1000);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
						
						TwoThreadWaitNotify.class.notify();
					}else {
						try {
							TwoThreadWaitNotify.class.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	
	/**
	 * 奇数线程
	 * @author Administrator
	 *
	 */
	public static class Odd implements Runnable{
		private TwoThreadWaitNotify numNotify;
		
		public Odd(TwoThreadWaitNotify numNotify) {
			this.numNotify=numNotify;
		}
		
		@Override
		public void run() {
			Logger.getLogger("runB");
			while(numNotify.num<=100){
				synchronized (TwoThreadWaitNotify.class) {
					if (numNotify.flag!=true) {
						System.out.println(Thread.currentThread().getName()+"奇数"+numNotify.num);
						numNotify.num++;
						numNotify.flag=true;
//						try {
//							Thread.sleep(1000);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
						TwoThreadWaitNotify.class.notify();
					}else {
						try {
							TwoThreadWaitNotify.class.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}


