package ThreadTest;

import java.util.concurrent.Exchanger;

public class ExchangerTest {
	public static void main(String[] args) {
		Exchanger<Integer> exchanger=new Exchanger<Integer>();
		new Thread(new ExchangerTestA(exchanger)).start();
		new Thread(new ExchangerTestB(exchanger)).start();
		
	}
}
