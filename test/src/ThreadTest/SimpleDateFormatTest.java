package ThreadTest;

import java.text.SimpleDateFormat;

import pencilTest.NewTest;

//针对SimpleDateFormat非线程安全问题的解决办法
public class SimpleDateFormatTest {
	
	private static ThreadLocal<SimpleDateFormat> simpleThreadLocal=new ThreadLocal<SimpleDateFormat>(){
		protected SimpleDateFormat initialvalue(){
			return new SimpleDateFormat("yyyy-MM-dd HH-mm-s");
		}
		
	};
	
	public static void main(String[] args) {
		//使用局部变量
		//加同步锁
		//使用ThreadLocal定义一个全局的simpledateformat
		
		
	}
}
