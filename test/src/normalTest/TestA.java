package normalTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import SwordOffer.Solution3.ListNode;

public class TestA {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
		TestA a=new TestA();
		a.test();
		List<String> list=new ArrayList<>();
		list.add("a");
		list.add("b");
		for (String string : list) {
			System.out.println(string);
		}
		Integer[] arr={1,2,3};
		List list2=Arrays.asList(arr);//这里的aslist（）是一个适配器模式，将数组转化成list
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>(12);
		//两种线程的安全的ArrayList实现方式
		List<Integer> arrayList2=new CopyOnWriteArrayList<>();
		List<Integer> arrayList3=Collections.synchronizedList(arrayList);
	}
	
	public static void test()
			throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
		Class<?> c = methodClass.class;
		Object object = c.newInstance();
		Method[] methods = c.getMethods();
		Method[] declaredMethods = c.getDeclaredMethods();
		// 获取methodClass类的add方法
		Method method = c.getMethod("add", int.class, int.class);
		// getMethods()方法获取的所有方法
		System.out.println("getMethods获取的方法：");
		for (Method m : methods)
			System.out.println(m);
		// getDeclaredMethods()方法获取的所有方法
		System.out.println("getDeclaredMethods获取的方法：");
		for (Method m : declaredMethods)
			System.out.println(m);
	}
}

class methodClass {
	public final int fuck = 3;

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a + b;
	}

}
