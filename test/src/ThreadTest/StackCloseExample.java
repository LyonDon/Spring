package threadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StackCloseExample {
	public void add100() {
		int cnt = 0;
		for (int i = 0; i < 100; i++) {
			cnt++;
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
	    StackCloseExample example = new StackCloseExample();
	    ExecutorService executorService = Executors.newCachedThreadPool();
	    executorService.execute(() -> example.add100());
	    executorService.execute(() -> example.add100());
	    executorService.shutdown();
	}

}
