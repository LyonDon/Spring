package threadTest;

public class DeadLockTest {
	public static void main(String[] args) {
		Object lock1 = new Object();
		Object lock2 = new Object();
		new Thread(new Thread2(lock1, lock2)).start();
		new Thread(new Thread1(lock1, lock2)).start();
	}
}

class Thread1 implements Runnable {
	Object lock1;
	Object lock2;

	public Thread1(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
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

class Thread2 implements Runnable {
	Object lock1;
	Object lock2;

	public Thread2(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
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
