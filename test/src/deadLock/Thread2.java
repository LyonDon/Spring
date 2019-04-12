package deadLock;

public class Thread2 implements Runnable {
	Object lock1;
	Object lock2;
	
	public Thread2(Object lock1,Object lock2) {
		this.lock1=lock1;
		this.lock2=lock2;
	}

	@Override
	public void run() {
		synchronized (lock2) {
			System.out.println("获取了lock2锁");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (lock1) {
				System.out.println("获取了lock1锁");
			}
		}

	}

}
