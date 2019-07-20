package SwordOffer;

/**
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 * @author Administrator
 */
public class Solution52 {
	public boolean match(char[] str, char[] pattern){

		if (str==null||pattern==null) {
			return false;
		}
		int i=0;
		int j=0;
		return matchCore(str,pattern,i,j);
	}
	
	public boolean matchCore(char[] str,char[] pattern,int i,int j) {
		//有效性检验。str到尾，pattern到尾，返回true
        //若pattern到尾，str未到尾，返回false
		if (i==str.length&&(j==pattern.length)) {
			return true;
		}
		if (i!=str.length&&(j==pattern.length)) {
			return false;
		}
		//如果模式的第二的字符是“*”的话，若pattern的第一位与str的第一位不同，则pattern后移两位，继续匹配
        //若pattern的第一位与str的第一位相同，有三种匹配情况：
        //pattern后移两位，str不移位，相当于忽略x*
        //str后移一位，pattern后移两位，相当于一个x
        //str后移一位，pattern不移位，因为还能匹配之后的元素
		if (j+1<pattern.length&&pattern[j+1]=='*') {
			if (i!=str.length&&str[i]==pattern[j]||(pattern[j]=='.'&&i!=str.length)) {
				return matchCore(str, pattern, i, j+2)||matchCore(str, pattern, i+1, j+2)||matchCore(str, pattern, i+1, j);
			}else {
				return matchCore(str, pattern, i, j+2);
			}
		}
        //如果模式的第二个字符不是“*”的话，有两种情况
        //若第一个字符匹配，则判断第二个字符
        //若第一个字符不匹配，则返回false；
		if ((i!=str.length&&str[i]==pattern[j])||(i!=str.length&&pattern[j]=='.')) {
			return matchCore(str, pattern, i+1, j+1);
		}
		return false;
	}
}
