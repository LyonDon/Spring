package normalTest;

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
	}
}
