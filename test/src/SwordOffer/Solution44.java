package SwordOffer;

/**
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么
 * @author Administrator
 *
 */
public class Solution44 {
	public static String ReverseSentence(String str) {
		String[] resString=str.split(" ");
		if (resString.length==0) {
			return str;
		}
		reverse(resString, 0,resString.length-1);
		String res="";
		for (int i = 0; i < resString.length; i++) {
			res+=" "+resString[i];
		}
		res=res.substring(1);
		return res;
	}
	
	public static void reverse(String[] str,int start,int end) {
		while(start<end){
			String tmpString=str[start];
			str[start]=str[end];
			str[end]=tmpString;
			start++;
			end--;
		}
	}
	
}
