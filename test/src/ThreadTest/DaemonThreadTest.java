package threadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonThreadTest {
	public static void main(String[] args) {
		
		Thread mainThread=new Thread(new Runnable() {
			
			@Override
			public void run() {
//				ChildThread是Runnable接口的实现类，new ChildThread就等于实现了Runnable的方法，Thread(Runnable target)
				Thread childThread=new Thread(new ChildThread());
				childThread.setDaemon(true);
				childThread.start();
				System.out.println("This is main Thread");
				
//				//守护线程用线程池的方式开启
//				ExecutorService service=Executors.newCachedThreadPool();
//				Thread childThread=new Thread(new ChildThread());
//				service.execute(childThread);
//				childThread.setDaemon(true);
//				service.shutdown();
//				System.out.println("this is a main Thread");
			}
		});
		mainThread.start();
	}
}

class ChildThread implements Runnable {

	@Override
	public void run() {
		while (true) {

			System.out.println("This is a childThread");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}