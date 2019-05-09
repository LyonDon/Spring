package JVM;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
//运行时常量池导致的内存溢出异常
public class RuntimeConstantPoolOOM {
	public static void main(String[] args) {
		String string1=new StringBuilder("计算机").append("软件").toString();
		System.out.println(string1.intern()==string1);
		
		String string2=new StringBuilder("ja").append("va").toString();
		System.out.println(string2.intern()==string2);
	}
}
