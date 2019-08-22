package normalTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;

//自增运算的精确定义
public class AllKindOfAdd {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int i = 0;
		int a = i++;
		int b = ++a;
		int c = a + b;
		int d = (a == 1) ? b : c;
		System.out.println(i);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int count=0;
		count=count++;
		System.out.println("count="+count);
		
		String string1="123";
		String string2="321";
		int res=string1.compareTo(string2);
		System.out.println(res);
		
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
		map.put(1, 1);
		map.put(2,2);
		map.put(3,3);
		map.put(4,4);
		map.put(5,5);
	}

}
