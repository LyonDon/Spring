package JVM;

import java.util.ArrayList;
import java.util.List;
/**
 * 重载与自动装箱
 * 会自动识别对应的方法，不会出现自动装箱
 * @author Administrator
 *
 */
public class AutoboxingTest {
	public void test(int num){
	    System.out.println("method with primitive argument");

	}

	public void test(Integer num){
	    System.out.println("method with wrapper argument");

	}

	//calling overloaded method
	public static void main(String[] args) {
		AutoboxingTest autoTest = new AutoboxingTest();
		int value = 3;
		autoTest.test(value);//no autoboxing 
		Integer iValue = value;
		autoTest.test(iValue); //no autoboxing	
	}
	
}
