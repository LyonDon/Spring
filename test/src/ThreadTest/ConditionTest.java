package threadTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {
	final Lock lock = new ReentrantLock();

	Condition notFull = lock.newCondition();
	Condition notEmpty = lock.newCondition();

	Object[] list = new Object[100];
	int takeptr, putptr, num;

	public void put(Object x) throws InterruptedException {
		try {
			lock.lock();
			while (num == list.length)
				notFull.await();
			list[putptr] = x;
			if (++putptr == list.length) {
				putptr = 0;
			}
			++num;
			notEmpty.signal();
		} finally {
			lock.unlock();
		}

	}

	public void take() throws InterruptedException {
		try {
			lock.lock();
			while (num == 0) {
				notEmpty.await();
			}
			Object xObject = list[takeptr];
			if (++takeptr == list.length) {
				takeptr = 0;
			}
			--num;
			notFull.signal();
		} finally {
			lock.unlock();
		}

	}
}
