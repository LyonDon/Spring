package JVM;

/**
 * 静态方法分派演示
 * @author Administrator
 *
 */
public class StaticDispatch {
	static abstract class Human {
	}
	
	static class Man extends Human{
	}
	
	static class Woman extends Human{
		
	}
	
	public void sayHello(Human human) {
		System.out.println("Hi human");
	}
	
	public void sayHello(Man human) {
		System.out.println("Hi man");
	}
	
	public void sayHello(Woman human) {
		System.out.println("Hi woman");
	}
	
	public static void main(String[] args) {
		Human man=new Man();
		Human woman=new Woman();
		StaticDispatch sDispatch=new StaticDispatch();
		sDispatch.sayHello(man);
		sDispatch.sayHello(woman);
	}
}
