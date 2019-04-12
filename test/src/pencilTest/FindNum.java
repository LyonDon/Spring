package pencilTest;

import java.util.Scanner;

/**
 * 找出序列中未出现的数
 * @author Administrator
 *
 */
public class FindNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.charAt(0);
        
        if (n>0) {
			findNumber(str.substring(1), n);
		}
    }
    
    public static void findNumber(String s,int n){
    	if (s.length()==0||s==null) {
			return;
		}
    	for (int i = 0; i < n; i++) {
			if (!s.contains(" "+i)) {
				System.out.println(i);
				return;
			}
		}
    }
}