package normalTest;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//遍历hashmap的几种方式
public class Hashmap {
	public static void main(String[] args) {
		Map<Integer, String> map=new LinkedHashMap<Integer, String>();
		map.put(1,"one");
		map.put(2,"two");
		map.put(3,"three");
		map.put(4,"four");
		map.put(5,"five");
		//通过keyset
		for (Integer keyString : map.keySet()) {
			System.out.println(keyString+":"+map.get(keyString));
		}
		//通过entryset
		for (Entry<Integer, String> entry :map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		//通过values，只能遍历value
		for (String string : map.values()) {
			System.out.println(string);
		}
		//通过keyset返回Iterator集合
		Iterator<Integer> iterator=map.keySet().iterator();
		while(iterator.hasNext()){
			Integer key=iterator.next();
			System.out.println(key+":"+map.get(key));
		}
		//通过values返回Iterator集合
		Iterator<String> iterator2=map.values().iterator();
		while(iterator2.hasNext()){
			String string=iterator2.next();
			System.out.println(string);
		}
		//通过EntrySet返回Iterator集合
		Iterator<Map.Entry<Integer, String>> iterator3=map.entrySet().iterator();
		while(iterator3.hasNext()){
			//这里不能直接用Iterator，这只是个迭代器
			Map.Entry<Integer, String> entry=iterator3.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}