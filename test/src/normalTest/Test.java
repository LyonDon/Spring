package normalTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//一些针对ArrayList和LinkedList的测试
public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.remove(arrayList.get(1));
		arrayList.remove(arrayList.get(2));
		System.out.println(arrayList.toString());
		System.out.println(get_round(1, 5));
		LinkedList<Integer>	list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()){
			Integer integer=iterator.next();
			System.out.println(integer);
		}
	}
	public static int get_round(int i,int j) {
		int n=j-i;
		if (n==0) {
			return 0;
		}
		int res=0;
		for (int k = 1; k <= n; k++) {
			res+=k;
		}
		return res;
	}
}
