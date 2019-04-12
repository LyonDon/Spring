package deadLock;

public class Thread1 implements Runnable{
	Object lock1;
	Object lock2;
	
	public Thread1(Object lock1,Object lock2) {
		this.lock1=lock1;
		this.lock2=lock2;
	}
	@Override
	public void run() {
		synchronized (lock1) {
			System.out.println("获得了lock1锁");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (lock2) {
				System.out.println("获得了lock2锁");
			}
		}
		
	}

}
