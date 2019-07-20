package SwordOffer;

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是
 * @author Administrator
 *
 */
public class Solution53 {
	public boolean isNumeric(char[] str) {
		 if (str==null||str.length==0) {
			return false;
		}
		 boolean hashE=false;
		 boolean addreduce=false;
		 boolean decimal=false;
		 //判断e值
		 for (int i = 0; i < str.length; i++) {
			if (str[i]=='e'||str[i]=='E') {
				if (i==0) {
					return false;
				}
				if (i==str.length-1) {
					return false;
				}
				hashE=true;
			}
			//判断加减号
			else if (str[i]=='+'||str[i]=='-') {
				if (i!=0) {
					if (addreduce&&str[i-1]!='e'&&str[i-1]!='E') {
						return false;
					}
				}
				addreduce=true;
			}
			//判断小数点
			else if (str[i]=='.') {
				if (decimal&&hashE) {
					return false;
				}
				decimal=true;
			}
			//判断数字大小
			else if (str[i]<'0'||str[i]>'9') {
				return false;
			}
		 }
		return true; 
	}
}
