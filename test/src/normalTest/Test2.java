package normalTest;

import java.util.TreeSet;

/**
 * 
 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Object o = new Object() {
			public boolean equals(Object obj) {
				return true;
			}
		};
		System.out.println(o.equals("Fred"));
		
		int[][] x=new int[2][3];
		for (int[] is : x) {
			for (int i : is) {
				System.out.println(i);
			}
		}
		
		String string="string";
		int x1=string.charAt(2);
		System.out.println(x1);
		String sssString="mwarbwiyrkptolflyoehgneakwkjypyuvsmrwpycsvrvcxjtholdhaxgsfcnmcqcztywyfxmtjqbjpabuemymzmqhmqptzoyghavetxfadwrxulyvpdmnvmknfhlplaqbmaasqicbwxwfxzyxkgwiltpwjfbdmjzrrzzqkqrxuosbymfpztsssangraylrvdbdekfcyzajailztgzxpuxzutqehgcfdvoiqlktjuyirmqhzttiyavflldthcutoxtgzcboiurxwxnsyoekndxwexivojpomsnwhlqqzzopifhnppogv";
		System.out.println(sssString.substring(1,6));
		System.out.println(sssString.length());
		
		char a='4'-'0';
		char b='8'-'0';
		System.out.println(a*b);
		
		TreeSet<String> set=new TreeSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("ba");
		set.add("ab");
		set.add("abc");
		set.add("cba");
		
		System.out.println(set);
		
		
		
	}
}
