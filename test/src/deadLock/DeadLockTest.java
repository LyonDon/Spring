package deadLock;

public class DeadLockTest {
	public static void main(String[] args) {
		Object lock1=new Object();
		Object lock2=new Object();
//		Thread1 thread1=new Thread1(lock1, lock2);
//		Thread2 thread2=new Thread2(lock1, lock2);
		new Thread(new Thread1(lock1, lock2)).start();
		new Thread(new Thread2(lock1, lock2)).start();
	}
}
