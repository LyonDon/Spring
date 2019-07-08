package threadTest;

class ThreadExample extends Thread{
	private Test mv;
	public ThreadExample(Test mv) {
		this.mv=mv;
	}
	@Override
	public void run() {
		synchronized (mv) {
			mv.m();
		}
	}
}

class Test{
	private int data;
	int result=0;
	public void m() {
		result+=2;
		data+=2;
		System.out.print(result+" "+data);
	}
}

public class ThreadTest{
	public class Task implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		Test mv=new Test();
		Thread t1=new ThreadExample(mv);
		Thread t2=new ThreadExample(mv);
		Thread t3=new ThreadExample(mv);
		
		t1.start();
		t2.start();
		t3.start();
	}
}