package reflectionTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取一个类的全部构造方法
 * 
 * @author Administrator
 *
 */
class Person1 {
	// public Person1() {}
	private String name;
	private int age;

	public Person1(String name) {
	}

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class ClassTestDemo {
	public static void main(String[] args)throws Exception {
		Class<?> class1 = Class.forName("reflectionTest.Person1");
		Constructor<?> constructor[] = class1.getConstructors();
		for (int i = 0; i < constructor.length; i++) {
			System.out.println(constructor[i]);
		}

		Class<?> class2 = Class.forName("reflectionTest.Person1");
		Constructor<?> constructor2=class2.getConstructor(String.class,int.class);
		Object object = constructor2.newInstance("张三",20);
		System.out.println(object);
	}
}
