package SwordOffer;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 * @author Administrator
 *
 */
public class Solution12 {
	public static double power(double base,int exponent) {
		double res=1.0;
		if(exponent<0){
			int tmp=Math.abs(exponent);
			while(tmp>0){
				res*=base;
				tmp--;
			}
			res=1/res;
		}else {
			while(exponent>0){
				res*=base;
				exponent--;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(power(2.2,2));
	}

}
