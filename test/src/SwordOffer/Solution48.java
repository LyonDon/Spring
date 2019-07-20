package SwordOffer;
/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @author Administrator
 */
public class Solution48 {
	public static int Add(int num1,int num2) {
		//对两个数字进行异或，然后左移一位，将两个结果再异或。循环这个过程，即可得到相加的和
		int sum=num1^num2;
		int carry=(num1&num2)<<1;
		while(carry!=0){
			int tmp=sum^carry;//不带进位的加相当于异或操作
			carry=(sum&carry)<<1;//进位相当于异或之后左移一位操作
			sum=tmp;
		}
		return sum;
	}
	public static int reduce(int num1,int num2) {
		//先求减数的补码,取反加一(~符号表示取反)
		num2=Add(~num2, 1);
		return Add(num1, num2);
	}
	
	public static int multiply(int num1,int num2){
		//取绝对值
		int multiply_A=Add(~num1,1);
		int multiply_B=Add(~num2,1);
		
		int i=0;
		int res=num1;
		while(i<num2){
			res=Add(num1, res);
			i++;
		}
		if ((num1<0&&num2<0)||(num1>0&&num2>0)) {
			return res;
		}
		return Add(~res, 1);
	}
	
}
