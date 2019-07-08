package threadTest;

import java.util.concurrent.Exchanger;
import java.util.concurrent.atomic.AtomicReference;

public class ExchangerTestA implements Runnable {
	private Exchanger<Integer> exchanger;

	private final AtomicReference<Integer> last = new AtomicReference<Integer>(10);

	public ExchangerTestA(Exchanger<Integer> exchanger) {
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			while (true) {
				last.set(exchanger.exchange(last.get()));
				System.out.println("After calling exchanger threadA become:" + last.get());
				Thread.sleep(1000);
				if (last.get()==20) {
//					Thread.interrupted();
					break;
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

