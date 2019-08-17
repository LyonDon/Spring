package pencilTest.Beike;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//N表示测试组数
		int N=scanner.nextInt();
		//表示每组数量的数组
		int num[]=new int[N];
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			num[i]=scanner.nextInt();
			ArrayList<Integer> res=new ArrayList<Integer>();
			for (int j = 0; j < num[i]; j++) {
				arrayList.add(scanner.nextInt());
				arrayList.add(scanner.nextInt());
			}
			Collections.sort(arrayList);
			for (int j = 0; j <arrayList.size(); j+=2) {
				if (arrayList.get(j)==arrayList.get(j+1)) {
					continue;
				}else {
					res.add(arrayList.get(j));
					res.add(arrayList.get(j+1));
				}
			}
			arrayList.clear();
			if (res.size()<=2) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
