package SwordOffer;

/**
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 
 * 数值为0或者字符串不是一个合法的数值则返回0。
 * 
 * 输入一个字符串,包括数字字母符号,可以为空
 * 如果是合法的数值表达则返回该数字，否则返回0
 * @author Administrator
 *
 */
public class Solution49 {
	public int StrToInt(String str) {
		if (str.length()==0) {
			return 0;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)!=0||str.charAt(i)!=1||str.charAt(i)!=2||str.charAt(i)!=3||str.charAt(i)!=4||
					str.charAt(i)!=5||str.charAt(i)!=6||str.charAt(i)!=7||str.charAt(i)!=8||str.charAt(i)!=9){
				return 0;
			}
		}
		int res=0;
		int p=1;
		if (str.charAt(0)=='+') {
			for (int j =str.length()-1 ; j>0 ; j--) {
				res=res+Character.getNumericValue(str.charAt(j))*p;
			}	
			p*=10;
		}else if (str.charAt(0)=='-') {
			for (int j = str.length()-1; j >0; j--) {
				res=res+Character.getNumericValue(str.charAt(j))*p;
			}
			res=0-res;
		}else {
			for (int j = str.length()-1; j>=0 ; j--) {
				res=res+Character.getNumericValue(str.charAt(j))*p;
			}
		}
		return res;
	}
}
