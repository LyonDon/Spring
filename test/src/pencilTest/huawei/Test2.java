	package pencilTest.huawei;
	
	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import java.util.Scanner;
	/**
	 * 输入字符串a:2,b:3,c:4@b:1,c:2
	 * 输出a:2,b:1,c:2
	 * 为0的话不输出
	 * @author Administrator
	 *
	 */
	public class Test2 {
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			String s=scanner.nextLine();
			if (s.charAt(s.length()-1)=='@') {
				System.out.println(s.substring(0,s.length()-1));
			}
			else {
				String[] tmp=s.trim().split("@");
				LinkedHashMap<String, Integer> map1=new LinkedHashMap<String, Integer>();
				String[] t1=tmp[0].split(",");
				String[] t2=tmp[1].split(",");
				for (String t : t1) {
					String[] a=t.split(":");
					map1.put(a[0], Integer.valueOf(a[1]));
				}
				for (String t : t2) {
					String[] a=t.split(":");
					int value =map1.get(a[0])-Integer.valueOf(a[1]);
					if (value==0) {
						map1.remove(a[0]);
					}else {
						map1.put(a[0], value); 
					}
				}
				StringBuffer resBuffer=null;
				if (map1.size()!=0) {
					resBuffer=new StringBuffer();
					for (String t : map1.keySet()) {
						if (map1.get(t)!=0) {
							resBuffer.append(t).append(":").append(map1.get(t)).append(",");
						}
					}
					System.out.println(resBuffer.toString().substring(0, resBuffer.length()-1));
				}
			}
		}
	}
