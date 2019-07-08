package threadTest;

import java.util.concurrent.Exchanger;
import java.util.concurrent.atomic.AtomicReference;

public class ExchangerTestB implements Runnable {
	Exchanger<Integer> exchanger = new Exchanger<Integer>();

	//原子类引用整型，相当于创建一个整型对象
	private final AtomicReference<Integer> last = new AtomicReference<Integer>(20);

	public ExchangerTestB(Exchanger<Integer> exchanger) {
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			while (true) {
				last.set(exchanger.exchange(last.get()));
				System.out.println("After calling exchanger ThreadB become:" + last.get());
				Thread.sleep(1000);
				if (last.get()==10) {
//					Thread.interrupted();
					break;
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}