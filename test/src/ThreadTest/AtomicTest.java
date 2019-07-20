package threadTest;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
	private AtomicInteger mAtomicInteger=new AtomicInteger();
	
	private void doAdd(){
		for (int i = 0; i < 5; i++) {
			int value=mAtomicInteger.addAndGet(1);
			System.out.println(Thread.currentThread().getName()+":"+value);	
		}
	}
	
	public static void main(String[] args) {
		AtomicTest atomicTest=new AtomicTest();
		new Thread(atomicTest::doAdd,"线程1").start();
		new Thread(atomicTest::doAdd,"线程2").start();
	}
}
